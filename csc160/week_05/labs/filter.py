intlist = [int(i) for i in input().split()]
intlist.sort()
intlist.reverse()
for i in intlist:
    if i < 0:
        print(i, end=' ')