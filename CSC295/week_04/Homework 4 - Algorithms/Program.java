// Tyler J. Teichmann

// Import the ArrayList utility
import java.util.ArrayList;
// Import the scanner utility
import java.util.Scanner;

// Program class
public class Program {
    // Main method
    public static void main(String[] args) {
        // Initialize a new inventory for the user.
        ArrayList<Item> inventory = new ArrayList<Item>();
        
        // Initialize a scanner to take input from the user.
        Scanner scanner = new Scanner(System.in);
        
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
                // Add an item
                case "add":
                    // Add the item to the inventory.
                    add(inventory);
                    // Break out of the switch
                    break;

                // Display the inventory
                case "display":
                    // Call the display method.
                    display(inventory);
                    // Break out of the switch.
                    break;
            
                // Delete an Item
                case "delete":
                    // Prompt the user to enter the id for the item they would like to remove.
                    System.out.println("Please enter the id of the item you would like to delete: ");
                    // Create a variable called idToDelete and set it equal to the user's input.
                    String idToDelete = scanner.nextLine().toLowerCase();
                    // Call the delete method.
                    delete(idToDelete, inventory);
                    // Break out of the switch.
                    break;

                // Default case
                default:
                    // Print invalid input
                    System.out.println("Invalid input.");
                    // Break out of the switch.
                    break;
            }
        } while (!input.equals("q")); // Do this while input is not equal to "q"
        // Close the scanner.
        scanner.close();

        // Say "Goodbye" to the user.
        System.out.println("Goodbye!");
    }

    /**
     * Method to add an Item to the array
     * @param id id of the item to add
     * @param name name of the item to add
     * @param inventory inventory to add the item to.
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
            // if the id of an element equals the input id, that item exists in the inventory already
            if (inventory.get(i).getId().equals(id)) {
                // increment the quantity of that Item object
                inventory.get(i).setQuantity(inventory.get(i).getQuantity() + 1);
                // return
                return;
            }
        }
        // if we complete the for loop, the item is not in the inventory and we can create a new Item with the name and id.
        inventory.add(new Item(name, id));
    }

    /**
     * Method to display an inventory
     * @param inventory inventory to display
     */
    public static void display(ArrayList<Item> inventory) {
        // Print column headers
        System.out.println("Item" + "    " + "id" + "    " + "qty.");
        // Loop through the inventory
        for (int i = 0; i < inventory.size(); i++) {
            // for each Item, print the name, the id, and the quantity of the Item.
            System.out.println(inventory.get(i).getName() + " " + inventory.get(i) + " " + inventory.get(i).getQuantity());
        }
    }

    /**
     * Method to delete an item in the inventory
     * @param id id of the item to be deleted from the inventory
     * @param inventory inventory to delete from
     */
    public static void delete(String id, ArrayList<Item> inventory) {
        // Loop throught the inventory to find the index the item exists at
        for (int i = 0; i < inventory.size(); i++) {
            // if the id of an item at index i equals the id to be deleted
            if (inventory.get(i).getId().equals(id)) {
                // delete the Item at that index.
                inventory.remove(i);
            }
        }
    }
}