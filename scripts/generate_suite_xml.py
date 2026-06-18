import os
import sys
import re
import json
import xml.etree.ElementTree as ET

if len(sys.argv) < 3:
    print("Usage: python generate_suite_xml.py <report_dir> <output_dir>")
    sys.exit(1)

report_dir = sys.argv[1]
output_dir = sys.argv[2]

SUITE_SRC_DIR = os.path.join("src", "test", "java")
os.makedirs(output_dir, exist_ok=True)

build_id = os.environ.get("BUILD_UUID", "unknown")
repository_url = os.environ.get("REPOSITORY_URL", "unknown")
branch_name = os.environ.get("BRANCH_NAME", "unknown")
timestamp_generation = os.environ.get("TIMESTAMP_GENERATION", "unknown")
job_name = os.environ.get("JOB_NAME", "unknown")
build_url = os.environ.get("BUILD_URL", "unknown")

def extract_classes_from_suite(file_path):
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
    compact_content = re.sub(r'\s+', '', content)
    match = re.search(r'@(?:SuiteClasses|SelectClasses)\(\{([^}]+)\}\)', compact_content)
    if not match:
        return []

    raw_elements = match.group(1).split(',')
    full_classes = []
    for c in raw_elements:
        c = c.replace('.class', '').strip()
        full_classes.append(c)
    return full_classes

suite_mappings = {}
for root, _, files in os.walk(SUITE_SRC_DIR):
    for file in files:
        if file.endswith(".java") and "Suite" in file:
            suite_name = file.replace(".java", "")
            full_path = os.path.join(root, file)
            targeted_classes = extract_classes_from_suite(full_path)
            if targeted_classes:
                suite_mappings[suite_name] = targeted_classes

for suite_name, targeted_classes in suite_mappings.items():
    combined_root = ET.Element(
        "testsuite",
        suiteName=suite_name,
        buildID=build_id,
        repositoryUrl=repository_url,
        branchName=branch_name,
        jobName=job_name
    )
    files_combined = 0
    seen_methods = set()

    for full_class_path in targeted_classes:
        test_class_name = full_class_path.split('.')[-1]
        class_element = ET.Element("testclass", classname=full_class_path)
        class_has_cases = False

        for root_dir, _, files in os.walk(report_dir):
            for file in files:
                if file.endswith(f".{test_class_name}.xml") or file == f"{test_class_name}.xml":
                    src_file = os.path.join(root_dir, file)
                    try:
                        tree = ET.parse(src_file)
                        xml_root = tree.getroot()

                        testcases = xml_root.findall(".//testcase")
                        for tc in testcases:
                            t_name = tc.get("name", "")
                            clean_name = t_name[:-2] if t_name.endswith("()") else t_name
                            unique_method_sig = f"{full_class_path}#{clean_name}"

                            if unique_method_sig in seen_methods:
                                continue

                            seen_methods.add(unique_method_sig)
                            tc.set("classname", full_class_path)

                            if "name" in tc.attrib:
                                del tc.attrib["name"]
                            if "testID" in tc.attrib:
                                del tc.attrib["testID"]

                            class_element.append(tc)
                            class_has_cases = True

                    except Exception as e:
                        print(f"Error compiling XML {src_file}: {e}")

        if class_has_cases:
            combined_root.append(class_element)
            files_combined += 1

    if files_combined > 0:
        out_file = os.path.join(output_dir, f"{suite_name}.xml")
        combined_tree = ET.ElementTree(combined_root)
        if hasattr(ET, 'indent'):
            ET.indent(combined_tree, space="  ", level=0)
        combined_tree.write(out_file, encoding="utf-8", xml_declaration=True)
        print(f"Successfully generated custom structural XML: {out_file}")