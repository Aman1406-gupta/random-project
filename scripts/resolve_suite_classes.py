import os
import sys
import re

if len(sys.argv) < 2:
    print("")
    sys.exit(0)

target_suite = sys.argv[1]
SUITE_SRC_DIR = os.path.join("src", "test", "java")

def extract_classes_from_suite(file_path):
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
    compact_content = re.sub(r'\s+', '', content)
    match = re.search(r'@(?:SuiteClasses|SelectClasses)\(\{([^}]+)\}\)', compact_content)
    if not match:
        return []
    return [c.replace('.class', '').strip() for c in match.group(1).split(',')]

found_classes = []
for root, _, files in os.walk(SUITE_SRC_DIR):
    for file in files:
        if file == f"{target_suite}.java":
            found_classes = extract_classes_from_suite(os.path.join(root, file))
            break

if found_classes:
    gradle_args = " ".join([f'--tests "{c}"' for c in found_classes])
    print(gradle_args)
else:
    print("")