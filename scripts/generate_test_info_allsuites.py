import json
import os
import re
import subprocess
from datetime import datetime, timezone
import javalang

results = []
ROOT = "src/test/java"

def format_to_zulu_ms(date_str):
    if not date_str:
        return None
    try:
        date_str = re.sub(r'(\d{2}):(\d{2})$', r'\1\2', date_str)
        try:
            dt = datetime.strptime(date_str, "%Y-%m-%dT%H:%M:%S%z")
        except ValueError:
            dt = datetime.strptime(date_str, "%Y-%m-%dT%H:%M:%S.%f%z")
        dt_utc = dt.astimezone(timezone.utc)
        return dt_utc.strftime("%Y-%m-%dT%H:%M:%S.%f")[:-3] + "Z"
    except Exception:
        return None

for root, dirs, files in os.walk(ROOT):
    for file in files:
        if not file.endswith(".java") or file.startswith("RandomprojectApplicationTests"):
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
                )

                commit_lines = [
                    line.strip()
                    for line in history.splitlines()
                    if "|" in line
                ]

                if commit_lines:
                    newest = commit_lines[0].split("|")
                    oldest = commit_lines[-1].split("|")

                    iso_date_regex = r'^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}'

                    current_commit_sha = newest[0]
                    last_modified_at = format_to_zulu_ms(newest[1]) if re.match(iso_date_regex, newest[1]) else None
                    last_modified_by = newest[2]
                    created_at = format_to_zulu_ms(oldest[1]) if re.match(iso_date_regex, oldest[1]) else None
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
                "testId": f"{class_name}#{method.name}",
                "className": class_name,
                "methodName": method.name,
                "testCaseFilePath": path,
                "moduleName": module_name,
                "startLine": start_line,
                "endLine": end_line,
                "ownershipSource": "GIT_BLAME",
                "confidenceScore": 1.0,
                "createdAt": created_at,
                "lastModifiedAt": last_modified_at,
                "lastModifiedBy": last_modified_by,
                "currentCommitSha": current_commit_sha,
            })

os.makedirs("build/test-results/metadata", exist_ok=True)
with open("build/test-results/metadata/test-info.json", "w") as f:
    json.dump(results, f, indent=2)