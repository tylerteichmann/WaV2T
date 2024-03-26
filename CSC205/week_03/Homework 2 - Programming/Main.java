// Tyler J. Teichmann

// Main class for program
public class Main {
    
    // main method
    public static void main(String[] args) {
        // The future first pokemon's typing set to electric
        Type type1 = Type.ELECTRIC;
        // The future second pokemon's typing set to fire
        Type type2 = Type.FIRE;
        // Display first type
        System.out.println(type1);
        // Display second type
        System.out.println(type2);

        // Define pokemon 1
        Pokemon pokemon1 = new Pokemon();
        // Define pokemon 2
        Pokemon pokemon2 = new Pokemon();

        // Set pokemon 1's name to pikachu
        pokemon1.setName("Pikachu");
        // Set pokemon 1's type to type1 (electric)
        pokemon1.setType(type1);
        // Set pokemon 1's hp to 35
        pokemon1.setHp(35);

        // Set pokemon 2's name to charizard
        pokemon2.setName("Charizard");
        // Set pokemon 2's type to type2 (fire)
        pokemon2.setType(type2);
        // Set pokemon 2's hp to 35
        pokemon2.setHp(78);

        // Get pokemon 1's name
        System.out.println("Name: " + pokemon1.getName());
        // Get pokemon 1's type
        System.out.println("Type: " + pokemon1.getType());
        // Get pokemon 1's hp
        System.out.println("Base HP: " + pokemon1.getHp());

        // Print some new lines to space the pokemon apart
        System.out.println("\n --vs--\n");

        // Get pokemon 2's name
        System.out.println("Name: " + pokemon2.getName());
        // Get pokemon 2's type
        System.out.println("Type: " + pokemon2.getType());
        // Get pokemon 2's hp
        System.out.println("Base HP: " + pokemon2.getHp());
    }
    
}