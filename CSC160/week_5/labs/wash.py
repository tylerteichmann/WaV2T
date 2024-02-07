services = { 'Air freshener' : 1 , 'Rain repellent' : 2, 'Tire shine' : 2, 'Wax' : 3, 'Vacuum' : 5 }
base_wash = 10
total = 0

service_choice1 = input()
service_choice2 = input()

print(f"ZyCar Wash")
print(f"Base car wash - $10")
total += 10

if service_choice1 != '-':
    print(f"{service_choice1} - ${services[service_choice1]}")
    total += services[service_choice1]

if service_choice2 != '-':
    print(f"{service_choice2} - ${services[service_choice2]}")
    total += services[service_choice2]

print('-' * 5)
print(f"Total price: ${total}")