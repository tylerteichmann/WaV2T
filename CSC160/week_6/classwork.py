import math

# class Counter:

#     def __init__ (self):
#         self.count = 0

#     def increment(self):
#         self.count += 1

#     def decrement(self):
#         self.count -= 1
    
#     def get(self):
#         print(f"The value of this counter is {self.count}.")

# new_counter = Counter()

# for i in range(25):
#     new_counter.increment()

# new_counter.get()

class Point:

    def __init__(self, x=0, y=0) -> None:
        self.x_coordinate = x
        self.y_coordinate = y

    def coordinates(self):
        print(f"x-coordinate = {self.x_coordinate}")
        print(f"y-coordinate = {self.y_coordinate}")

    def move(self, delta_x, delta_y):
        self.x_coordinate += delta_x
        self.y_coordinate += delta_y

    def distance(self, other):
        dist = math.sqrt((pow(self.x_coordinate - other.x_coordinate, 2) + pow(self.y_coordinate - other.y_coordinate, 2)))
        print(dist)

    def __eq__(self, object) -> bool:
        return self.x_coordinate == object.x_coordinate and self.y_coordinate == object.y_coordinate

P1 = Point(1, 1)

P2 = Point(1, 1)

P3 = Point(1, 2)

print(f"P1 is equal to P2: {P1 == P2}")
print(f"P1 is equal to P3: {P1 == P3}")

# P1.distance(4, 3)

# P1.move()

# # P1.coordinates()

# var = 24

# P1 == P2
