# technically works, but not gatenteed to maintain order of dictionary values. Maybe two lists?

coins = {
    'Dollar':100,
    'Quarter':25,
    'Dime':10,
    'Nickel':5
    }
    
total_change = int(input())

if total_change > 0:
    remaining_change = total_change
        
    for coin in coins:
        qty = remaining_change // coins[coin]
        if qty != 0:
            print(f"{qty} {coin}{'' if qty == 1 else 's'}")
            remaining_change -= qty * coins[coin]
    
    
    if 0 < remaining_change < 5:
        print(f"{remaining_change} Penn{'y' if remaining_change == 1 else 'ies'}")
        
else:
    print("No change")