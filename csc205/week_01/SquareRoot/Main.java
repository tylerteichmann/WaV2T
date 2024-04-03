// Tyler J. Teichmann

import java.util.Scanner;

public class Main 
{

    // ACTIVITY
    // Add three variables of different types and display each to the console.

    public static void main(String[] args) {
        // System.out.println("Please enter a number between 0 and 10 for me to output");
        // Scanner scanner = new Scanner(System.in);
        // String userInput = scanner.nextLine();
        // int userInputAsInt = Integer.parseInt(userInput);
        // System.out.println(Math.exp(userInputAsInt));

        // String name = "Tyler";
        // System.out.println("Hello my name is " + name);
        // int years = 2;
        // System.out.println("I have lived in Washington for " + years + " years");
        // double money = 100000.00;
        // System.out.println("My ideal starting slary is $" + money);
        // scanner.close();

        // Ask the user to eneter a value
        System.out.println("Please enter a value");

        // Initialize a new scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a vaiable for user input
        double userInput;

        // Try to scan the input from the user and set the value to a varaible named userInput
        try {
            userInput = scanner.nextDouble();
            // Close the scanner
            scanner.close();
        }
        // Catch exceptions if user does not input a valid integer
        catch (Exception e) {
            // Print error
            System.out.println("Please provide a valid input. Program exiting.");            
            // Close the scanner
            scanner.close();
            // Return to exit
            return;
        }

        // Check if input is greater than zero, meaning it is positive
        if (userInput > 0) {
            // Square root the userInput
            double result = Math.sqrt(userInput);
            // Print the result
            System.out.println("The square root of your value is " + result);
        }
        // If input is 0 or less than 0, the result of a sqrt function will be imaginary.
        else {
            // Print an error because the value is not positive
            System.out.println("Error, result is an imaginary number!");
            // Return to exit
            return;
        }
        // Program complete, return.
        return;
    }
}