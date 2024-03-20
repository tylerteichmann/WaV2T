// Tyler J. Teichmann

// Import the scanner class
import java.util.Scanner;

// Main class for the application
public class Main {
    // main method for the application
    public static void main(String[] args) {
        // Initialize a new scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of quarters they have
        System.out.print("Please enter the number of quarters you have! ");

        // Read the number of quarters and store it as a variable called numQuarters
        int numQuarters = scanner.nextInt();

        // Ask the user to input the number of dimes they have
        System.out.print("Please enter the number of dimes you have! ");

        // Read the number of dimes and store it as a variable called numDimes
        int numDimes = scanner.nextInt();

        // Ask the user to input the number of quarters they have
        System.out.print("Please enter the number of nickels you have! ");

        // Read the number of nickels and store it as a variable called numNickels
        int numNickels = scanner.nextInt();

        // Ask the user to input the number of quarters they have
        System.out.print("Please enter the number of pennies you have! ");

        // Read the number of pennies and store it as a variable called numPennies
        int numPennies = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Create a new double called dollars
        double dollars = 0.00;

        // Add the number of quarters times .25 to dollars
        dollars += numQuarters * 0.25;

        // Add the number of dimes times .10 to dollars
        dollars += numDimes * 0.10;

        // Add the number of nickels times .05 to dollars
        dollars += numNickels * 0.05;

        // Add the number of pennies times .01 to dollars
        dollars += numPennies * 0.01;

        // Print formatted to two decimal places the value of the dollars variable.
        System.out.printf("You have $%.2f\n", dollars);

    }
}
