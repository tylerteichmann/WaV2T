string = input()

for char in string:
    if not char.isalpha():
        string = string.replace(char, "")

print(string)