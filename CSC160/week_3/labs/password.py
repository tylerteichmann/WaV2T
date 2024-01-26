def main():
    password = list(input())
    password.append("!")

    key = {
        'i':'1',
        'a':'@',
        'm':'M',
        'B':'8',
        's':'$'
    }

    for char in password:
        if char in key:
            password[password.index(char)] = key[char]

    password = ''.join(password)

    print(password)

if __name__ == "__main__":
    main()