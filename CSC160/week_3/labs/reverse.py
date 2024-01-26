text = input()

while not(text == 'Done' or  text == 'done' or text == 'd'):
    for i in range(len(text)):
        print(text[-i - 1], end='')
    print()
    text = input()