# with open("Pride and Prejudice.txt", 'r') as file:
#     lines = file.readlines()

# count = 0

# short_lines = [line for line in lines if len(line) == 1]

# for line in lines:
#     if len(lines) == 1:
#         line



# print(count)

# class WeatherForecast:

#     def __init__(self, skies, high, low):
#         self.skies = skies
#         self.high = high
#         self.low = low

#     def set_skies(self, skies):
#         self.skies = skies

#     def set_high(self, high):
#         self.high = high

#     def set_low(self, low):
#         self.low = low

#     def get_skies(self):
#         return self.skies

#     def get_high(self):
#         return self.high

#     def get_low(self):
#         return self.low
    
# class LocalWeatherForcast(WeatherForecast):

#     def __init__(self, loc, skies, high, low):
#         super().__init__(skies, high, low)
#         self.loc = loc

#     def set_loc(self, loc):
#         self.loc = loc

#     def get_loc(self):
#         return self.loc


# june_22 = WeatherForecast("Clear", 75, 45)

# print(june_22.get_high(), june_22.get_low(), june_22.get_skies())

# seattle_june_22 = LocalWeatherForcast("seattle", "rainy", 45, 38)

# print(seattle_june_22.get_skies())


class ASet:

    def __init__(self) -> None:
        self.the_set = set()

    def add_to(self, value):
        self.the_set.add(value)

    def remove_from(self, value):
        self.the_set.remove(value)

    def print(self):
        print(self.the_set)


class IntSet(ASet):
    def __init__(self) -> None:
        super().__init__()

    def add_to(self, value):
        if isinstance(value, (int)):
            self.the_set.add(value)
        else:
            print("can only add values with type of int")

set_a = IntSet()

set_a.add_to(3)

set_a.add_to(4)

set_a.print()

set_a.remove_from(4)

set_a.print()

set_a.add_to("string")

set_a.print()