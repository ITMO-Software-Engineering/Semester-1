f_in = open('source file.yml', 'r', encoding='utf_8')
f_out = open('output file.json', 'w', encoding='utf_8')

lines = list()
keyword = list()
lineCounter = 0
newLine = f_in.readline()
while newLine:
    lines.append(newLine)
    lineCounter += 1
    newLine = f_in.readline()
f_in.close()

lastLevel = len(lines[0]) - len(lines[0].lstrip())
f_out.write("{\n")
for i in range(0, lineCounter - 1):
    if lines[i].lstrip()[0] == '-':
        f_out.write('    "' + lines[i].lstrip().lstrip('-'))
    else:
        keyword = lines[i].lstrip().split(':', maxsplit=1)
        f_out.write('    "' + keyword[0] + '": "' + keyword[1].lstrip())
    nextLevel = len(lines[i + 1]) - len(lines[i + 1].lstrip())
    if nextLevel < lastLevel:
        f_out.write("  },"'\n')
    if nextLevel > lastLevel:
        f_out.write('"\n'"  {"'\n')
    lastLevel = nextLevel
f_out.write('  }\n}\n')
f_out.close()
