# Define your function here
def feet_to_steps(feet_walked):
    steps = int(feet_walked / 2.5)

    return steps

if __name__ == '__main__':
    # Type your code here.
    feet_walked = float(input())

    print(feet_to_steps(feet_walked))