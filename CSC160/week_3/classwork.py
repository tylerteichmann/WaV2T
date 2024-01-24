def main():
    # cond1 = True
    # cond2 = True
    # cond3 = True

    # if cond1:
    #     print("Point A")
        
    #     if cond2:
    #         print("Point B")
    #         if cond3:
    #             print("Point C")    
    #     print("Point D")
    # print("Point E")

    # if cond1:
    #     print("Point A")
    # else:
    #     print("Point B")
    #     if cond2:
    #         print("Point C")

    # print("Point D")

    # if cond1:
    #     print("Point A")
    # elif cond2:
    #     print("Point B")
    # elif cond3:
    #     print("Point C")

    # print("Point D")

    # numeric_grade = int(input())

    # if 95 <= numeric_grade:
    #     print("A")
    # elif 90 <= numeric_grade:
    #     print("A-")
    # elif 86 <= numeric_grade:
    #     print("B+")
    # elif 83 <= numeric_grade:
    #     print("B")
    # elif 80 <= numeric_grade:
    #     print("B-")
    # elif 76 <= numeric_grade:
    #     print("C+")
    # elif 73 <= numeric_grade:
    #     print("C")
    # elif 70 <= numeric_grade:
    #     print("C-")
    # elif 65 <= numeric_grade:
    #     print("D+")
    # elif 60 <= numeric_grade:
    #     print("D")
    # else:
    #     print("F")

    # highway_number = int(input())

    # # check if valid; 1-999 not divisible by 100.
    # if 0 < highway_number < 1000 and highway_number % 100 != 0:
        
    #     # check direction; even = east/west, odd = north/south
    #     if highway_number % 2 == 0:
    #         direction = "east/west"
    #     else:
    #         direction = "north/south"
        
    #     # check if primary or auxilliary
    #     if highway_number < 100:
    #         highway_type = "primary"
    #     else:
    #         highway_type = f"auxiliary, serving I-{highway_number % 100}"

    #     print(f"I-{highway_number} is {highway_type}, going {direction}.")

    # else:
    #     print(f"{highway_number} is not a valid interstate highway number.")
    
    input_month = input()
    input_day = int(input())
    
    if input_month == 'January' and 0 < input_day <= 31:
        print("Winter")
    elif input_month == 'February' and 0 < input_day <= 28:
        print("Winter")   
    elif input_month == 'March' and 0 < input_day <= 31:
        if input_day < 20:
            print("Winter")
        else:
            print("Spring")
    elif input_month == 'April' and 0 < input_day <= 30:
        print("Spring")   
    elif input_month == 'May' and 0 < input_day <= 31:
        print("Spring")   
    elif input_month == 'June' and 0 < input_day <= 30:
        if input_day < 21:
            print("Spring")
        else:
            print("Summer")
    elif input_month == 'July' and 0 < input_day <= 31:
        print("Summer")   
    elif input_month == 'August' and 0 < input_day <= 31:
        print("Summer")   
    elif input_month == 'September' and 0 < input_day <= 30:
        if input_day < 22:
            print("Summer")
        else:
            print("Autumn")    
    elif input_month == 'October' and 0 < input_day <= 31:
        print("Autumn")   
    elif input_month == 'November' and 0 < input_day <= 30:
        print("Autumn")   
    elif input_month == 'December' and 0 < input_day <= 31:
        if input_day < 22:
            print("Autumn")
        else:
            print("Winter")    
    else:
        print("Invalid")


if __name__ == '__main__':
    main()