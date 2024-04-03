start = int(input())
stop = int(input())

if start <= stop:
    for i in range(start, stop + 1, 5):
        print(i, end=' ')
    print()
else:
    print("Second integer can't be less than the first.")