# import math

def main():
    # quad(1, -7, 12)

    # print(divisible(4, 2))
    # print(divisible(5, 3))

    # print(fb(6))
    # print(fb(7))
    # print(fb(10))
    # print(fb(15))

    print(parrot_trouble(True, 6))
    print(parrot_trouble(True, 7))
    print(parrot_trouble(False, 6))
    print(parrot_trouble(True, 22))

    return 1


# def print_lyrics():
#     print("I'm a lumberjack, and I'm okay.")
#     print("I sleep all night and I work all day.")


# def circle_area(r):
#     print(math.pi * r**2)


# def quad(a, b, c):

#     for x in range(1, 6):
#         print(a * x**2 + b * x + c, end=' ')

#     print()
    

# def divisible(m, n):
#     return m % n == 0


# def fb(n):

#     if n % 3 == 0 and n % 5 == 0:
#         return "fizzbuzz"
    
#     if n % 3 == 0:
#         return "fizz"
    
#     if n % 5 == 0:
#         return "buzz"        
    
#     return "shucks"


# def sleep_in(weekday, vacation):
#     return not weekday or vacation


# def monkey_trouble(a_smile, b_smile):
#     return a_smile == b_smile


def parrot_trouble(talking, hour):
    return talking and not (20 >= hour >= 7)


if __name__ == '__main__':
    main()