file = input()
upper = input()
lower = input()

with open(file, 'r') as text:
    for line in text.readlines():
        in_range = True if upper <= line.rstrip() <= lower else False
        print(f"{line.rstrip()} - {'not ' if not in_range else ''}in range")
