// Tyler J. Teichmann

// Import the stack data structure.
import java.util.Stack;

/**
 * ParenthesisChecker
 */
public class ParenthesisChecker {

    /**
     * Main method for the program.
     * @param args Takes no command line arguments
     */
    public static void main(String[] args) {
        // Array to hold test strings
        String[] tests = new String[6];
        // Fist string to test, a case with single-typed brackets.
        tests[0] = "(4 + 3) * (2 + 6)";
        // Second string to test, a case with mixed-type brackets.
        tests[1] = "(4 * [3 + 6]) / 4";
        // Third string to test, a case with balanced scenario.
        tests[2] = "(){}[]";
        // Fourth string to test, a case with unbalanced scenario.
        tests[3] = "([{)]";
        // Fifth string to test, a case with an empty string.
        tests[4] = "";
        // Sixth string to test, a case with no parenthesis.
        tests[5] = "test string";

        // Loop through the test cases to print out if they are balanced
        for (int i = 0; i < tests.length; i++) {
            // Print out if the string is balnaced true or false
            System.out.println("Case " + (i + 1) + " string is balanced: " + isBalanced(tests[i]));
        }
    }


    /**
     * Checks if an expression has appropriate parenthesis.
     * @param expression Takes a string as input.
     * @return Returns true if string has proper parentesis.
     */
    public static boolean isBalanced(String expression) {
        // Create an array of characters to store the open parenthesis characters.
        final Character[] OPENPARENTHESISTYPES = new Character[] {'(', '{', '['};
        // Create an array of characters to stor the closed parenthesis characters.
        final Character[] CLOSEPARENTHESISTYPES = new Character[] {')', '}', ']'};

        // Create a new stack to store which parenthesis is current
        Stack<Character> stack = new Stack<Character>();
        
        // Loop through the string.
        for (int i = 0; i < expression.length(); i++) {;
            // Store the current char as a Character called currentChar.
            Character currentChar = expression.charAt(i);

            // Loop through the Open Parenthesis array
            for (int j = 0; j < OPENPARENTHESISTYPES.length; j++) {
                // If the current char mataches an open paranthesis.
                if (currentChar == OPENPARENTHESISTYPES[j]) {
                    // Push it on the stack to represent the current level
                    stack.push(currentChar);
                }
            }

            // Loop through the close Parenthsis array
            for (int j = 0; j < CLOSEPARENTHESISTYPES.length; j++) {
                // If the current char matches a closed parenthesis.
                if (currentChar == CLOSEPARENTHESISTYPES[j]) {
                    // peek at the current parenthesis on the stack
                    Character currentPara = stack.peek();
                    // If there is nothing in the stack
                    if (currentPara == null) {
                        // A closed parenthesis cannot come before an open parenthesis
                        // Return false.
                        return false;
                    // Else, an open paranthesis is on the stack
                    } else {
                        // Loop through the Open paranthesis array to find the index of the parenthesis peeked at.
                        for (int k = 0; k < OPENPARENTHESISTYPES.length; k++){
                            // once the current paranthesis is found in the array
                            if (currentPara == OPENPARENTHESISTYPES[k]) {
                                // check that the index of the Open parenthesis array is the same as the currentChars index in the close parenthesis array
                                if (j != k) {
                                    // if it is not, the current parenthesis is a different type and we can return false
                                    return false;
                                // Else the parenthesis are the same time
                                } else {
                                    // pop the current parenthesis off the stack
                                    stack.pop();
                                    // break out of the loop
                                    break;
                                }
                            }
                        }
                    }
                }
            }

        }

        // if the stack is not empty, some parenthesis were never closed, return false.
        return stack.size() == 0;
    }
}

//Look through string
// if open para found add to stack
// if close para found
    // stack empty - false
    // pop stack
        // return is not matching - false