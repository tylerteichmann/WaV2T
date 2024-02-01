string = input()
palindrome = string.replace(" ", "")

if palindrome == palindrome[::-1]:
    print(f"palindrome: {string}")
else:
    print(f"not a palindrome: {string}")