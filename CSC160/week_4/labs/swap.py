# Define your function here.
def swap_values(user_val1, user_val2, user_val3, user_val4):
    placeholder = user_val1
    user_val1 = user_val2
    user_val2 = placeholder

    placeholder = user_val3
    user_val3 = user_val4
    user_val4 = placeholder

    return user_val1, user_val2, user_val3, user_val4


if __name__ == '__main__': 
    # Type your code here. Your code must call the function.
    user_val1 = int(input())
    user_val2 = int(input())
    user_val3 = int(input())
    user_val4 = int(input())

    swap = swap_values(user_val1, user_val2, user_val3, user_val4)

    print(swap[0], swap[1], swap[2], swap[3])