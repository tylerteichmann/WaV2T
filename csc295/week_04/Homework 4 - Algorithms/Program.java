// Tyler J. Teichmann

// Import the ArrayList utility
import java.util.ArrayList;
// Import the scanner utility
import java.util.Scanner;

/**
 * Program class.
 */
public class Program {
    // Initialize a scanner to take input from the user.
    // Declared outside main, and static, so all methods can use it.
    private static final Scanner scanner = new Scanner(System.in);
    
    /**
     * main method.
     * @param args Program takes no command line arguments.
     */
    public static void main(String[] args) {
        // Initialize a new inventory for the user.
        ArrayList<Item> inventory = new ArrayList<Item>();
        
        
        // Initialize an variable to hold the input from the user.
        String input;
        
        // Do while loop to ask the user for input and the do that action.
        do {
            // Ask the user what they would like to do. Add, Display, Delete, or Quit.
            System.out.println("What would you like to do? (enter q to quit)");
            // Set the input variable to the input form the user as lowercase.
            input = scanner.nextLine().toLowerCase();


            // Implement a switch case for the response options.
            switch (input) {
                // Add an item.
                case "add":
                    // Call the add method.
                    add(inventory);
                    // Break out of the switch.
                    break;

                // Display the inventory.
                case "display":
                    // Call the display method.
                    display(inventory);
                    // Break out of the switch.
                    break;
            
                // Delete an Item.
                case "delete":
                    // Call the delete method.
                    delete(inventory);
                    // Break out of the switch.
                    break;

                // Quit the program.
                case "q":
                    break;

                // Default case.
                default:
                    // Print invalid input.
                    System.out.println("Invalid input.");
                    // Break out of the switch.
                    break;
            }
        } while (!input.equals("q")); // Do this while input is not equal to "q".

        // Close the scanner
        scanner.close();

        // Say "Goodbye" to the user.
        System.out.println("Goodbye!");
    }


    /**
     * Method to add an Item to the array.
     * @param inventory Inventory to add the item to.
     */
    public static void add(ArrayList<Item> inventory) {

        // Ask the user what Item they would like to add to the cart.
        System.out.println("Please enter the name of the item you would like to add: ");
        // Create a variable called name and set it equal to the name of the item that the user wants to add to their cart.
        String name = scanner.nextLine().toLowerCase();
        
        // Ask the user what the id of that item is.
        System.out.println("Please enter the id of the item you would like to add: ");
        // Create a variable called idToAdd and set it equal to the id of the item that the user wants to add to their cart.
        String id = scanner.nextLine().toLowerCase();

        // Search through the array to see if the item is already in the cart.
        for (int i = 0; i < inventory.size(); i++) {
            // If the id of an element equals the input id, that item exists in the inventory already.
            if (inventory.get(i).GetId().equals(id)) {
                // Increment the quantity of that item object.
                inventory.get(i).IncrementQuantity(true);
                // Return to main.
                return;
            }
        }

        // If we complete the for loop, the item is not in the inventory and we can create a new Item with the name and id.
        inventory.add(new Item(name, id));

        // // Close the scanner.
        // scanner.close();
    }


    /**
     * Method to display an inventory.
     * @param inventory Inventory to display.
     */
    public static void display(ArrayList<Item> inventory) {

        // Character width for each column
        int columnWidth = 15;

        // Format the top and bottom borders.
        String border = String.format("%1$-" + columnWidth + "s%2$" + columnWidth + "s%1$" + columnWidth + "s", "+", "").replace(' ', '-');
        // Format the row template.
        String rowFormat = "| %-" + (columnWidth - 2) + "s%-" + columnWidth + "s%-" + (columnWidth - 2) + "s |";

        // Column 1 header.
        String column1 = "Name";
        // Column 2 header.
        String column2 = "ID";
        // Column 3 header.
        String column3 = "QTY";

        // Print the top Border
        System.out.println(border);

        // Print the column headers
        System.out.println(String.format(rowFormat, column1, column2, column3));

        // Print the bottom Border
        System.out.println(border);

        // Loop through the inventory.
        for (int i = 0; i < inventory.size(); i++) {

            // For each Item, print the name, the id, and the quantity of the Item.
            System.out.println(String.format(
                    rowFormat, 
                    inventory.get(i).GetName(), 
                    inventory.get(i).GetId(), 
                    inventory.get(i).GetQuantity()
                )
            );

        }

        // Print another bottom Border if items are displayed
        if (inventory.size() > 0) System.out.println(border);
    }


    /**
     * Method to delete an item in the inventory.
     * @param id Id of the item to be deleted from the inventory.
     * @param inventory Inventory to delete from.
     */
    public static void delete(ArrayList<Item> inventory) {
        
        // String to store user input.
        String id;

        // Do while loop to ask the user for an item to delete as long as item exists.
        do {
            // Prompt the user to enter the id for the item they would like to remove.
            System.out.println("Please enter the id of the item you would like to delete: ");
            // Create a variable called idToDelete and set it equal to the user's input.
            id = scanner.nextLine().toLowerCase();
    
            // Loop through the inventory to find the index the item exists at.
            for (int i = 0; i < inventory.size(); i++) {
                // If the id of an item at index i equals the id to be deleted
                if (inventory.get(i).GetId().equals(id)) {
                    // Decrement the quantity.
                    inventory.get(i).IncrementQuantity(false);
                    // Delete the item at that index if quantity is 0.
                    if(inventory.get(i).GetQuantity() == 0) inventory.remove(i);
    
                    // Return if item was deleted.
                    return;
                }
            }
            
            // Inform the user that the item was not found.
            System.out.println("Item not in cart. Enter 'q' at anytime to return.");

        // While user input is not "q"
        } while (!id.equals("q"));
    }
}