import yaml
import json
import time

with open('source file.yml', 'r', encoding='utf-8') as f_in:
    content = yaml.load(f_in, Loader=yaml.SafeLoader)

with open('output file.json', 'w', encoding='utf-8') as f_out:
    content = json.dumps(content, ensure_ascii=False)
    f_out.write(content)
