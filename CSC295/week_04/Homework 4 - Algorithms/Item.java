// Tyler J. Teichmann

// Item class.
public class Item {
    // id attribute.
    private String id;
    // name attribute.
    private String name;
    // quantity attribute.
    private int quantity;

    // Constructor class to initialize all attributes.
    public Item(String name, String id) {
        // Set the id to the input id from the user
        this.id = id;
        // Set the name to the input name from the user
        this.name = name;
        // Set the quantity to one.
        this.quantity = 1;
    }

    // ...
    public String toString() {
        return this.id;
    }

    // Getter for the item id.
    public String getId() {
        // return the id for the item
        return this.id;
    }

    // Getter for the item name.
    public String getName() {
        // return the name of the item
        return this.name;
    }

    // Getter for the item quantity.
    public int getQuantity() {
        // return the quantity of the item
        return this.quantity;
    }
    
    // Setter for the item id.
    public void setId(String id) {
        // Set the id of the item to the input id
        this.id = id;
    }

    // Setter for the item name.
    public void setName(String name) {
        // Set the name of the item to the input name
        this.name = name;
    }

    // Setter for the item quantity.
    public void setQuantity(int quantity) {
        // Set the quantity of the item to the input quantity.
        this.quantity = quantity;
    }
}
