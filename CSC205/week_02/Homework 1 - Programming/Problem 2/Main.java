// Tyler J. Teichmann

// Import the scanner class
import java.util.Scanner;

// Main class for the application
public class Main {
    
    // main method for the application
    public static void main(String[] args) {
        // Ask the user for their name
        System.out.println("Hello, what is your name?");
        
        // Initialize a new scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the user's input and store it in a variable called userName
        String userName = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Convert the name to capitals
        userName = userName.toUpperCase();

        // Print the greeting
        System.out.println("Hello, " + userName + ", nice to meet you!");

    }
}
