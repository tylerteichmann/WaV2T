// Tyler J. Teichmann

// Main class for the application
public class Main {

    // main method for the application
    public static void main(String[] args) {
        // Roll the first die and set the result
        int firstDieResult = rollDice();

        // Print the first result
        System.out.println("The first die comes up " + firstDieResult);

        // Roll the second die and set the result
        int secondDieResult = rollDice();

        // Print the second result
        System.out.println("The second die comes up " + secondDieResult);

        // Add the two results and set the total
        int total = firstDieResult + secondDieResult;
        
        // Print the total
        System.out.println("your total roll is " + total);
                
    }

    // Method to roll the dice
    static int rollDice() {
        // Generate a randome number between 1 and six inclusive and set it as an integer variable named result.
        int result = (int)(Math.random() * 6) + 1;
        // Return result.
        return result;
    }

}
