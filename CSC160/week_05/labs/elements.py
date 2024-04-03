elements = [int(i) for i in input().split()]
values = [int(i) for i in input().split()]
for e in elements:
    if values[0] <= e <= values[1]:
        print(e, end=' ')