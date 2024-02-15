import csv

with open(input(), 'r') as file:
    words = csv.reader(file).__next__()
    unique = []
    [unique.append(x) for x in words if x not in unique]
    for word in unique:
        print(f"{word} - {words.count(word)}")
    