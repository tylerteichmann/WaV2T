from datetime import date, timedelta, time

# 1 Complete read_date()
def read_date():
    """Read a string representing a date in the format 2121-04-12, create a
    date object from the input string, and return the date object
    """
    date_in = input().split('-')

    return date(int(date_in[0]), int(date_in[1]), int(date_in[2]))
    

# 2. Use read_date() to read four (unique) date objects, putting the date objects in a list
date1 = read_date()
date2 = read_date()
date3 = read_date()
date4 = read_date()

date_list = [ date1, date2, date3, date4 ]


# 3. Use sorted() to sort the dates, earliest first
sorted_dates = sorted(date_list)

# 4. Output the sorted_dates in order, earliest first, in the format mm/dd/yy
for day in sorted_dates:
    print(day.strftime("%m/%d/%Y"))

# 5. Output the number of days between the last two dates in the sorted list
#    as a positive number
print((sorted_dates[-1] - sorted_dates[-2]).days)

# 6. Output the date that is 3 weeks from the most recent date in the list
print((sorted_dates[-1] + timedelta(weeks=3)).strftime("%B %d, %Y"))

# 7. Output the full name of the day of the week of the earliest day
print(min(sorted_dates).strftime("%A"))
