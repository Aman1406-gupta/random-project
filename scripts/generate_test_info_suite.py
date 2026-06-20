import json
import os
import sys
import re
import subprocess
from datetime import datetime, timezone
import javalang

filter_suite_name = sys.argv[1] if len(sys.argv) > 1 else None
results = []
ROOT = "src/test/java"

def format_to_zulu_ms(date_str):
    if not date_str: return None
    try:
        date_str = re.sub(r'(\d{2}):(\d{2})$', r'\1\2', date_str)
        try:
            dt = datetime.strptime(date_str, "%Y-%m-%dT%H:%M:%S%z")
        except ValueError:
            dt = datetime.strptime(date_str, "%Y-%m-%dT%H:%M:%S.%f%z")
        return dt.astimezone(timezone.utc).strftime("%Y-%m-%dT%H:%M:%S.%f")[:-3] + "Z"
    except Exception:
        return None

def extract_classes_from_suite(file_path):
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
    compact_content = re.sub(r'\s+', '', content)
    match = re.search(r'@(?:SuiteClasses|SelectClasses)\(\{([^}]+)\}\)', compact_content)
    if not match: return []
    return [c.split('.')[-1] for c in match.group(1).split(',')]

allowed_class_names = []
if filter_suite_name:
    for r, _, fs in os.walk(ROOT):
        for f in fs:
            if f == f"{filter_suite_name}.java":
                allowed_class_names = extract_classes_from_suite(os.path.join(r, f))
                break

for root, dirs, files in os.walk(ROOT):
    for file in files:
        if not file.endswith(".java") or file.startswith("RandomprojectApplicationTests"):
            continue

        class_name = file.replace(".java", "")

        if filter_suite_name and class_name not in allowed_class_names:
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
            if src_index > 0: module_name = parts[src_index - 1]

        for _, method in tree.filter(javalang.tree.MethodDeclaration):
            if "Test" not in [a.name for a in method.annotations]:
                continue

            start_line = method.position.line
            brace_count, started, end_line = 0, False, start_line

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

            try:
                history = subprocess.check_output(
                    ["git", "log", "--format=%H|%aI|%an", "-L", f"{start_line},{end_line}:{path}"],
                    text=True, stderr=subprocess.DEVNULL
                )
                commit_lines = [l.strip() for l in history.splitlines() if "|" in l]
                if commit_lines:
                    newest, oldest = commit_lines[0].split("|"), commit_lines[-1].split("|")
                    iso_date_regex = r'^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}'
                    current_commit_sha = newest[0]
                    last_modified_at = format_to_zulu_ms(newest[1]) if re.match(iso_date_regex, newest[1]) else None
                    last_modified_by = newest[2]
                    created_at = format_to_zulu_ms(oldest[1]) if re.match(iso_date_regex, oldest[1]) else None
                else:
                    current_commit_sha = last_modified_at = last_modified_by = created_at = None
            except Exception:
                current_commit_sha = last_modified_at = last_modified_by = created_at = None

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
out_path = f"build/test-results/metadata/test-info-{filter_suite_name}.json" if filter_suite_name else "build/test-results/metadata/test-info.json"
with open(out_path, "w") as f:
    json.dump(results, f, indent=2)