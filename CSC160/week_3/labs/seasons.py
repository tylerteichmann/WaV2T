class Month:
    def __init__(self):
        self.index = 0
        self.days = 0

January = Month()
January.index = 1
January.days = 31

February = Month()
February.index = 2
February.days = 28

input_month = input()
input_day = int(input())

# if input_month == 'January' and 0 < input_day <= 31:
#     print("Winter")
# elif input_month == 'February' and 0 < input_day <= 28:
#     print("Winter")   
# elif input_month == 'March' and 0 < input_day <= 31:
#     if input_day < 20:
#         print("Winter")
#     else:
#         print("Spring")
# elif input_month == 'April' and 0 < input_day <= 30:
#     print("Spring")   
# elif input_month == 'May' and 0 < input_day <= 31:
#     print("Spring")   
# elif input_month == 'June' and 0 < input_day <= 30:
#     if input_day < 21:
#         print("Spring")
#     else:
#         print("Summer")
# elif input_month == 'July' and 0 < input_day <= 31:
#     print("Summer")   
# elif input_month == 'August' and 0 < input_day <= 31:
#     print("Summer")   
# elif input_month == 'September' and 0 < input_day <= 30:
#     if input_day < 22:
#         print("Summer")
#     else:
#         print("Autumn")    
# elif input_month == 'October' and 0 < input_day <= 31:
#     print("Autumn")   
# elif input_month == 'November' and 0 < input_day <= 30:
#     print("Autumn")   
# elif input_month == 'December' and 0 < input_day <= 31:
#     if input_day < 22:
#         print("Autumn")
#     else:
#         print("Winter")    
# else:
#     print("Invalid")