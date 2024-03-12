// Tyler J. Teichmann

// Import the scanner class
import java.util.Scanner;

// Main class
public class GuessingGame {

    // main method
    public static void main(String[] args) {
        // Generate a random number
        int randomNumber = (int)(Math.random() * 100) + 1;

        // Prompt the user to provide some input
        System.out.println("Guess an int between 1 and 100.");

        // Create a new instance of a scanner object
        Scanner scanner = new Scanner(System.in);

        // Read the input from the user
        int userGuess = scanner.nextInt();
        
    }
}