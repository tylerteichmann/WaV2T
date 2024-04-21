// Tyler J. Teichmann

import java.util.ArrayList;
import java.util.List;
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
        String[] tests = new String[5];
        // Fist string to test, a case with single-typed brackets.
        tests[0] = "()";
        // Second string to test, a case with mixed-type brackets.
        tests[1] = "({[]})";
        // Third string to test, a case with balanced scenario.
        tests[2] = "(){}[]";
        // Fourth string to test, a case with unbalanced scenario.
        tests[3] = "([{)]";
        // Fifth string to test, a case with an empty string.
        tests[4] = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Case " + (i + 1) + " string is " + isBalanced(tests[i]));
        }
    }


    /**
     * Checks if an expression has appropriate parenthesis.
     * @param expression
     * @return
     */
    public static boolean isBalanced(String expression) {
        final Character[] OPENPARENTHESISTYPES = new Character[] {'(', '{', '['};
        final Character[] CLOSEPARENTHESISTYPES = new Character[] {')', '}', ']'};

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < expression.length(); i++) {;
            Character currentChar = expression.charAt(i);

            for (int j = 0; j < OPENPARENTHESISTYPES.length; j++) {
                if (currentChar == OPENPARENTHESISTYPES[j]) {
                    stack.push(currentChar);
                }
            }

            for (int j = 0; j < CLOSEPARENTHESISTYPES.length; j++) {
                if (currentChar == CLOSEPARENTHESISTYPES[j]) {
                    Character currentPara = stack.pop();
                    if (currentPara == null) {
                        return false;
                    } else {
                        int index = 0;
                        while (index < 3) {
                            if (currentPara == OPENPARENTHESISTYPES[index]) break;
                            index++;
                        }
                        if (j != index) return false;
                    }
                }
            }

        }

        return stack.size() == 0;
    }
}

//Look through string
// if open para found add to stack
// if close para found
    // stack empty - false
    // pop stack
        // return is not matching - false