import os
import sys
import xml.etree.ElementTree as ET

report_dir = sys.argv[1]
output_dir = sys.argv[2]

os.makedirs(output_dir, exist_ok=True)

for root, dirs, files in os.walk(report_dir):

    for file in files:

        if not file.endswith(".xml"):
            continue

        src = os.path.join(root, file)

        try:
            tree = ET.parse(src)
            xml_root = tree.getroot()
        except:
            continue

        suite_name = file.replace(".xml", "")

        xml_root.set(
            "suiteName",
            suite_name
        )

        out_file = os.path.join(
            output_dir,
            suite_name + ".xml"
        )

        tree.write(
            out_file,
            encoding="utf-8",
            xml_declaration=True
        )