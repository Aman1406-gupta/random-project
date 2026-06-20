import os
import sys
import re
import json
import xml.etree.ElementTree as ET

if len(sys.argv) < 4:
    print("Usage: python generate_suite_xml.py <report_dir> <output_dir> <timestamp_json_path> [suite_name]")
    sys.exit(1)

report_dir = sys.argv[1]
output_dir = sys.argv[2]
timestamp_json_path = sys.argv[3]
filter_suite_name = sys.argv[4] if len(sys.argv) > 4 else None

SUITE_SRC_DIR = os.path.join("src", "test", "java")
os.makedirs(output_dir, exist_ok=True)

build_id = os.environ.get("BUILD_UUID", "unknown")
repository_url = os.environ.get("REPOSITORY_URL", "unknown")
branch_name = os.environ.get("BRANCH_NAME", "unknown")
timestamp_generation = os.environ.get("TIMESTAMP_GENERATION", "unknown")
job_name = os.environ.get("JOB_NAME", "unknown")

timestamp_map = {}
try:
    if os.path.exists(timestamp_json_path):
        with open(timestamp_json_path, "r", encoding="utf-8") as jf:
            raw_timestamps = json.load(jf)
            for unique_id, timestamp in raw_timestamps.items():
                class_match = re.search(r'\[class:([^\]]+)\]', unique_id)
                method_match = re.search(r'\[method:([^\]\(]+)', unique_id)
                if class_match and method_match:
                    timestamp_map[f"{class_match.group(1)}#{method_match.group(1)}"] = timestamp
except Exception as e:
    print(f"Warning: Could not process listener timestamps: {e}")

def extract_classes_from_suite(file_path):
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
    compact_content = re.sub(r'\s+', '', content)
    match = re.search(r'@(?:SuiteClasses|SelectClasses)\(\{([^}]+)\}\)', compact_content)
    if not match:
        return []
    return [c.replace('.class', '').strip() for c in match.group(1).split(',')]

suite_mappings = {}
for root, _, files in os.walk(SUITE_SRC_DIR):
    for file in files:
        if file.endswith(".java") and "Suite" in file:
            suite_name = file.replace(".java", "")

            if filter_suite_name and suite_name != filter_suite_name:
                continue

            targeted_classes = extract_classes_from_suite(os.path.join(root, file))
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
                            tc.set("methodname", clean_name)

                            tc.set("timestamp_execution", timestamp_map.get(unique_method_sig, xml_root.get("timestamp", "")))

                            if "name" in tc.attrib: del tc.attrib["name"]
                            if "testID" in tc.attrib: del tc.attrib["testID"]

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