// Tyler J. Teichmann

// Item class.
public class Item {

    // id attribute.
    private String id;
    // name attribute.
    private String name;
    // quantity attribute.
    private int quantity;


    /**
     * Non-default constructor for an Item.
     * @param name Name of the item.
     * @param id Id of the item.
     */
    public Item(String name, String id) {
        // Set the id to the input id from the user.
        this.id = id;
        // Set the name to the input name from the user.
        this.name = name;
        // Set the quantity to one.
        this.quantity = 1;
    }


    /**
     * Gets the id of the item.
     * @return Returns the item's id.
     */
    public String GetId() {
        // Return the id for the item.
        return this.id;
    }

    /**
     * Gets the name of the item.
     * @return Returns the item's name.
     */
    public String GetName() {
        // Return the name of the item.
        return this.name;
    }

    /**
     * Gets the quantity of the item.
     * @return Returns the item's quantity.
     */
    public int GetQuantity() {
        // Return the quantity of the item
        return this.quantity;
    }
    
    /**
     * Set the item's id.
     * @param id Takes the new id of the item.
     */
    public void SetId(String id) {
        // Set the id of the item to the input id
        this.id = id;
    }

    /**
     * Sets the item's name.
     * @param name Takes the new name of the item as input.
     */
    public void SetName(String name) {
        // Set the name of the item to the input name.
        this.name = name;
    }

    /**
     * Sets the item's quantity.
     * @param quantity Takes the quantity of the item as input.
     */
    public void SetQuantity(int quantity) {
        // Set the quantity of the item to the input quantity.
        this.quantity = quantity;
    }

    /**
     * Increments or decrements the quantity of an item.
     * @param increment Input true to increment, false to decrement. 
     */
    public void IncrementQuantity(boolean increment) {
        // If increment is true.
        if (increment) {
            // Increment the quantity.
            this.quantity++;
        // Else
        } else {
            // Decrement the quantity.
            this.quantity--;
        }
    }
}
