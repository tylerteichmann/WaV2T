import math

def main():
# the - has lower precidence than **
#     print(- 1 ** 2)
#     print(- 1 * - 1)

# compoud operators
    # x = 1
    # x *= 100
    # x += 10
    # x -= 20
    # x /= 2
    # x **=.5

    # print(x)

    # x = 5 / 3
    # print(x)

    # x = 5 // 3
    # print(x)

    # x = 5 % 3
    # print(x)

    # print("TomDickHarry")
    # print("Tom\nDick\nHarry")
    # print("Tom\\nDick\\nHarry")
    # print("Tom\\\Dick\\\Harry")
    # print(f"each\and")

#     num_books = 2
#     price = 30
#     s = f'I bought {num_books} books for {price} each\
#  and paid ${num_books * price:.2f}.'
#     print(s)
    
    # names = [ 'Tom', 'Dick', 'Harry' ]
    # # print(names)

    # names2 = ['Susan', 'Alice', 'Beth']
    # namesb = names + names2
    # print(namesb)

    # t1 = 1, 2, 3

    # x = t1[0]
    # print(x)

    # x = t1[-1]
    # print(x)

    # ASet = { "cat", "dog", "parrot" }
    # AList = [ "cat", "dog", "parrot" ]
    # ATuple = "cat", "dog", "parrot"

    # print(type(ASet[0]))
    # print(type(AList[0]))
    # print(type(ATuple[0]))

    adict = {
        "Joe": 175,
        "Tom": 190,
        "Dick": 150
    }

    adict["Harry"] = 180

    print(adict["Dick"])

    return 1

if __name__ == "__main__":
    main()