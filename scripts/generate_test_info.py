import json
import os
import subprocess
import javalang

results = []

ROOT = "src/test/java"

for root, dirs, files in os.walk(ROOT):

    for file in files:

        if not file.endswith(".java"):
            continue

        path = os.path.join(root, file)

        with open(path, encoding="utf-8") as f:
            source = f.read()

        try:
            tree = javalang.parse.parse(source)
        except Exception:
            continue

        lines = source.splitlines()

        parts = path.split(os.sep)

        module_name = "root"

        if "src" in parts:
            src_index = parts.index("src")
            if src_index > 0:
                module_name = parts[src_index - 1]

        for _, method in tree.filter(javalang.tree.MethodDeclaration):

            annotations = [a.name for a in method.annotations]

            if "Test" not in annotations:
                continue

            start_line = method.position.line

            brace_count = 0
            started = False
            end_line = start_line

            for idx in range(start_line - 1, len(lines)):

                line = lines[idx]

                if "{" in line:
                    brace_count += line.count("{")
                    started = True

                if "}" in line:
                    brace_count -= line.count("}")

                if started and brace_count == 0:
                    end_line = idx + 1
                    break

            class_name = file.replace(".java", "")
            test_id = class_name + "#" + method.name

            try:
                blame = subprocess.check_output(
                    [
                        "git",
                        "blame",
                        "-L",
                        f"{start_line},{end_line}",
                        path
                    ],
                    text=True,
                    stderr=subprocess.DEVNULL
                )

                owner = blame.split("(")[1].split()[0]

            except Exception:
                owner = "UNKNOWN"

            try:
                history = subprocess.check_output(
                    [
                        "git",
                        "log",
                        "--format=%H|%aI|%an",
                        "-L",
                        f"{start_line},{end_line}:{path}"
                    ],
                    text=True,
                    stderr=subprocess.DEVNULL
                ).strip()

                commits = [
                    line.strip()
                    for line in history.splitlines()
                    if line.strip()
                ]

                if commits:

                    newest = commits[0].split("|")
                    oldest = commits[-1].split("|")

                    current_commit_sha = newest[0]
                    last_modified_at = newest[1]
                    last_modified_by = newest[2]

                    created_at = oldest[1]

                else:

                    current_commit_sha = None
                    last_modified_at = None
                    last_modified_by = None
                    created_at = None

            except Exception:

                current_commit_sha = None
                last_modified_at = None
                last_modified_by = None
                created_at = None

            results.append({
                "testID": test_id,
                "testName": method.name + "()",
                "className": class_name,
                "methodName": method.name,
                "testCaseFilePath": path,
                "moduleName": module_name,
                "startLine": start_line,
                "endLine": end_line,
                "methodOwner": owner,
                "resolvedOwner": owner,
                "ownershipSource": "GIT_BLAME",
                "confidenceScore": 1.0,
                "createdAt": created_at,
                "lastModifiedAt": last_modified_at,
                "lastModifiedBy": last_modified_by,
                "currentCommitSha": current_commit_sha
            })

os.makedirs(
    "build/test-results/metadata",
    exist_ok=True
)

with open(
        "build/test-results/metadata/test-info.json",
        "w"
) as f:
    json.dump(results, f, indent=2)