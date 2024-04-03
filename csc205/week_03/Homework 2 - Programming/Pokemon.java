// enum for the Pokemon's type
enum Type {
    NORMAL, FIGHTING, FLYING, POISON, GROUND, ROCK, BUG, GHOST, STEEL, FIRE, WATER, GRASS, ELECTRIC, PSYCHIC, ICE, DRAGON, DARK, FAIRY
}

// Pokemon class
public class Pokemon {
    // Private property 1 for the Pokemon's name
    private String name;
    // Private property 2 for the Pokemon's type
    private Type type;
    // Private property 3 for the Pokemon's HP;
    private int hp;

    // Getter for name
    public String getName() {
        // Return the name
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        // Set the name
        this.name = name;
    }

    // Getter for type
    public Type getType() {
        // Return the name
        return this.type;
    }

    // Setter for type
    public void setType(Type type) {
        // Set the name
        this.type = type;
    }

    // Getter for hp
    public int getHp() {
        // Return the name
        return this.hp;
    }

    // Setter for hp
    public void setHp(int hp) {
        // Set the name
        this.hp = hp;
    }
}
