import yaml
import json

f_in = open('source file.yml', 'r', encoding='utf-8')
f_out = open('output file.json', 'w')

content = yaml.load(stream=f_in, Loader=yaml.SafeLoader)
print(content)

f_out.write(json.dumps(content))
