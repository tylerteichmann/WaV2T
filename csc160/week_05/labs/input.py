data = []
input_data = input().split()

for string in input_data:
    data.append(float(string))

print(f"{max(data):.2f} {sum(data)/len(data):.2f}")