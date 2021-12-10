f_in = open('source file3.yml', 'r', encoding='utf-8')
f_out = open('output file.json', 'w', encoding='utf-8')

bigBrackets = [0]*100  # 指针表示缩进层级，存放当前层级下未配对的大括号数量，每当输出一个'{'时+1，输出一个'}\n'时-1，所有缩进层级下的最后应归零
middleBrackets = [0]*100  # 同上一行，存放当前缩进层级下未配对的中括号数量
lines = list()  # 记录每一行的信息，存进列表
keyword = list()  # 存放关键字
lineCounter = 1  # 记录文件行数

newLine = f_in.readline()  # 预读第一行文件内容
while newLine:  # 循环读取每一行文件，并统计文件行数
    lines.append(newLine)
    lineCounter += 1
    newLine = f_in.readline()
lines.append('')  # 额外补充空行，给后续循环过程中对下一行的判断留出空间
lines.append('')  # 同上
lines.append('')  # 同上
lineCounter += 3  # 同时加上补充的空行

# print("lineCounter=", lineCounter)
f_out.write("{\n")  # 每一个 JSON 文件开头必带的'{'符号
print("'{' at level 0")  # 测试输出1

level = 1  # 记录输出文件中当前行的缩进层级，由于 JSON 文件的特性，默认从一级缩进开始


def write_space(level_num):  # 根据当前的缩进层级输出空格，空格数量=缩进层级*2
    temp = level_num
    while temp > 0:
        f_out.write("  ")
        temp -= 1


for i in range(0, lineCounter - 1):  # 循环枚举记录的每一行文本
    if i == 0:  # 如果当前为第一行
        lastLevel = 0  # 输入文件上一行左侧的空格数 = 0
        thisLevel = len(lines[i]) - len(lines[i].lstrip())  # 输入文件当前行左侧的空格数 = 当前行的字符数 - 当前行去掉左侧空格后的字符数
    else:  # 如果当前不为第一行
        lastLevel = len(lines[i - 1]) - len(lines[i - 1].lstrip())  # 输入文件上一行左侧的空格数 = 上一行的字符数 - 上一行去掉左侧空格后的字符数
        thisLevel = len(lines[i]) - len(lines[i].lstrip())  # 当前行的字符数 - 当前行去掉左侧空格后的字符数

    if lastLevel < thisLevel:  # 如果当前行的缩进层级比上一行深
        level += (thisLevel-lastLevel)//2  # 根据当前行和上一行左侧的空格数的差增加输出文件的缩进层级（因为有可能缩进层级在两行内增加了多级）

    if lastLevel > thisLevel:  # 如果当前行的缩进层级比上一行浅
        level -= (lastLevel-thisLevel)//2  # 根据当前行和上一行左侧的空格数的差减小输出文件的缩进层级（因为有可能缩进层级在两行内减小了多级）
        if bigBrackets[level] > 0:  # 如果当前缩进层级下存在未匹配的大括号
            write_space(level)  # 根据缩进层级写入空格
            if lines[i+1] == '' or lines[i+1] == '\n':  # 如果下一行为空行
                f_out.write('}\n')  # 写入右大括号并换行
                bigBrackets[level] -= 1  # 当前缩进层级下未匹配的大括号数量 -1
                print("'}' at level", level)  # 测试输出
            else:
                f_out.write('},\n')  # 否则输出带有逗号的右大括号并换行
                bigBrackets[level] -= 1  # 当前缩进层级下未匹配的大括号数量 -1
                print("'}' at level", level)  #

    print("level=", level, "lastLevel=", lastLevel, "thisLevel=", thisLevel)  # 测试输出
    print(lines[i])  # 测试输出

    if middleBrackets[level] != 0:  # 如果当前缩进层级存在未匹配的中括号
        write_space(level)  # 根据当前缩进层级写入空格
        if lines[i+1].strip() == '':
            f_out.write(']\n')  # 写入右大括号并换行
            middleBrackets[level] -= 1  # 当前缩进层级下未匹配的中括号数量 -1
            print("']' at level", level)  # 测试输出
        else:
            f_out.write('],\n')  # 写入右大括号并换行
            middleBrackets[level] -= 1  # 当前缩进层级下未匹配的中括号数量 -1
            print("']' at level", level)  # 测试输出

    if '-' in lines[i]:  # 如果当前行存在'-'
        keyword = lines[i].strip().split('-', maxsplit=1)  # 根据该符号分割出关键字，并只进行一次分割，误判值中的 '-' 符号
        print("|keyword0=" + keyword[0] + "|keyword1=" + keyword[1])  # 测试输出
        if keyword[0].strip() == '' and keyword[1].strip() == '':
            write_space(level)   # 根据当前缩进层级写入空格
            f_out.write('{\n')   # 写入左大括号并换行
            print("'{'at level", level)  # 测试输出
            bigBrackets[level] += 1  # 当前缩进层级下未匹配的大括号数量 +1
        elif keyword[0].strip() == '' and keyword[1].strip() != '':
            if (lines[i+1] == '') or ('-' not in lines[i+1]):
                write_space(level)  # 根据当前缩进层级写入空格
                f_out.write('"' + keyword[1].strip() + '"\n')
            else:
                write_space(level)  # 根据当前缩进层级写入空格
                f_out.write('"' + keyword[1].strip() + '",\n')

    if ':' in lines[i]:  # 如果当前行中存在 ':' 符号
        keyword = lines[i].strip().split(':', maxsplit=1)  # 根据该符号分割出关键字，并只进行一次分割，误判值中的 '-' 符号
        print("|keyword0="+keyword[0]+"|keyword1="+keyword[1])  # 测试输出
        if keyword[1].strip() == "":
            if '-' in lines[i+1]:  #
                write_space(level)  # 根据当前缩进层级写入空格
                f_out.write('"' + keyword[0].strip() + '": [\n')
                print("'['at level", level)  # 测试输出
                middleBrackets[level] += 1  # 当前缩进层级下未匹配的中括号数量 +1
            else:
                write_space(level)  # 根据当前缩进层级写入空格
                f_out.write('"' + keyword[0].strip() + '": {\n')
                print("'{'at level", level)  # 测试输出
                bigBrackets[level] += 1  # 当前缩进层级下未匹配的中括号数量 +1
        elif lines[i+1].strip() == '-':
            write_space(level)  # 根据当前缩进层级写入空格
            f_out.write('"' + keyword[0].strip() + '": "' + keyword[1].strip() + '"\n')
        elif (lines[i+1] == '\n') or (lines[i+1] == ''):
            write_space(level)  # 根据当前缩进层级写入空格
            f_out.write('"' + keyword[0].strip() + '": "' + keyword[1].strip() + '"\n')
            if bigBrackets[level-1] > 0:
                write_space(level-1)  # 根据预估的下一行缩进层级写入空格
                f_out.write('}\n')  # 写入右大括号并换行
                bigBrackets[level-1] -= 1  # 当前预估的下一行缩进层级下未匹配的大括号数量 -1
                print("'}' at level", level-1)  # 测试输出
        else:
            write_space(level)  # 根据当前缩进层级写入空格
            f_out.write('"' + keyword[0].strip() + '": "' + keyword[1].strip() + '",\n')

f_out.write('}\n')
print("'}' at level 0")

f_in.close()
f_out.close()
