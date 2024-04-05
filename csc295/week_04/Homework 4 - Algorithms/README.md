# Methodology
To solve this problem, I first decided that I would take input from the user and use that to determine what action to take. I used a switch statement that would call a method to either add, display, or delete an item in the inventory with a default case that would tell the user their input was invalid. To allow the user to do this multiple times, I wrapped the switch in a do-while loop that would continue to evaluate true as long as the input from the user was not 'q'.

Following this I then created a method for add, display, and delete. Each taking the inventory as a parameter. 

The add method prompts the user to input an item name and id, then does a linear search of the inventory for the item. If it exists, the quantity is incremented. If it does not, a new item is created and added to the inventory.

The display method formats a table, then loops through the inventory, displaying the name of an item, its ID and the quantity.

The delete method prompts the user to input the id of an item they would like to remove. It then does a linear search to see if the item exists in the inventory. If it does, the quantity is decremented by 1 and if it equals 0, the item is removed from the inventory. If the item id is not found, the program tells th user that the item is not in the cart and re-prompts the user for valid input.

# Challenges faced
One challenge I had was being able to use the scanner in the add and delete methods. Every time I tired to create a new one and take input from the user within the methods, my program would crash. To get around this, and without passing the scanner as an argument. I initialized the scanner instance as a static object within the program. This allowed me to access it in all of my methods. Upon completion of the main method, the scanner was then closed.

# Learned
The biggest thing I learned from this assignment was how to create formatted strings. To create a table that displayed nicely on the console, I wanted to add padding around the outputs so they would align with the column headers. To do this I researched the String.format() method and found it was very similar to C/C++. To format a variable into a string I used the syntax %s and added the variable name as a second parameter. To add padding, I included the number of spaces to the right (including the string length) between % and s (i.e. %(total length)s). To then adjust padding from the left to the right I changed the total length to be negative.