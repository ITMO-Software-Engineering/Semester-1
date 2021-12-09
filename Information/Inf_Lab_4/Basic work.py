f_in = open('source file.yml', 'r', encoding='utf_8')
f_out = open('output file.json', 'w', encoding='utf_8')

bigBrackets = [0]*100
middleBrackets = [0]*100
lines = list()
keyword = list()
lineCounter = 1

newLine = f_in.readline()
while newLine:
    lines.append(newLine)
    lineCounter += 1
    newLine = f_in.readline()
lines.append('')
lines.append('')
lines.append('')
lineCounter += 3

print("lineCounter=", lineCounter)
f_out.write("{\n")
level = 0


def write_space(level_num):
    temp = level_num
    while temp >= 0:
        f_out.write("  ")
        temp -= 1


for i in range(0, lineCounter - 1):
    if i == 0:
        lastLevel = 0
        thisLevel = len(lines[i]) - len(lines[i].lstrip())
    else:
        lastLevel = len(lines[i - 1]) - len(lines[i - 1].lstrip())
        thisLevel = len(lines[i]) - len(lines[i].lstrip())
    if lastLevel < thisLevel:
        level += (thisLevel-lastLevel)//2
    if lastLevel > thisLevel:
        level -= (lastLevel-thisLevel)//2
        if bigBrackets[level] != 0:
            write_space(level)
            if lines[i+1] == '' or lines[i+1] == '\n':
                f_out.write('}\n')
                bigBrackets[level] -= 1
            else:
                f_out.write('},\n')
                bigBrackets[level] -= 1
        if middleBrackets[level] != 0:
            write_space(level)
            f_out.write(']\n')
            middleBrackets[level] -= 1

    print("level=", level, "lastLevel=", lastLevel, "thisLevel=", thisLevel)
    if ':' in lines[i]:
        keyword = lines[i].strip().split(':', maxsplit=1)
        print("|keyword0="+keyword[0]+"|keyword1="+keyword[1])
        if keyword[1].strip() == "":
            write_space(level)
            f_out.write('"' + keyword[0].strip() + '": [\n')
            print("'['at level", level)
            middleBrackets[level] += 1
        elif lines[i+1].strip() == '-':
            write_space(level)
            f_out.write('"' + keyword[0].strip() + '": "' + keyword[1].strip() + '"\n')
        elif (lines[i+1] == '\n') or (lines[i+1] == ''):
            write_space(level)
            f_out.write('"' + keyword[0].strip() + '": "' + keyword[1].strip() + '"\n')
            write_space(level-1)
            f_out.write('}\n')
        else:
            write_space(level)
            f_out.write('"' + keyword[0].strip() + '": "' + keyword[1].strip() + '",\n')
    if lines[i].strip() == '-':
        write_space(level)
        f_out.write('{\n')
        print("'{'at level", level)
        bigBrackets[level] += 1
f_out.write('}\n')

f_in.close()
f_out.close()
