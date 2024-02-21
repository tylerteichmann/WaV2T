with open("Pride and Prejudice.txt", 'r') as file:
    lines = file.readlines()

count = 0

short_lines = [line for line in lines if len(line) == 1]

for line in lines:
    if len(lines) == 1:
        line



print(count)