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
        
        // Create a variable to store the user's guess
        int userGuess = -1;

        // Check the users guess
        while (userGuess != randomNumber) {
            // prompt the user to enter a guess.
            System.out.println("Enter your guess now: ");

            // Read the input from the user. Assume user will enter just an integer in the desired range
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Guessed number was too low, try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("Guessed number was too high, try again!");
            }
        }

        // close the scanner
        scanner.close();

        // While loop is broken, user wins
        System.out.println("You guessed correctly! Great job!");
    }
}