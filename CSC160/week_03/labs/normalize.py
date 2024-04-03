inputs = int(input())
floats = []

for i in range(inputs):
    floats.append(float(input()))
    # print(floats[i])

for f in floats:
    print(f"{f / max(floats):.2f}")