// Tyler J. Teichmann

import java.util.Arrays;

// Main program class
public class FindOne {

    // main method
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 1, 2, 2, 6, 6, 8, 8, 9, 9, 10, 10, 11, 14, 14};
        // Print the value of the single
        System.out.println("The single value is " + findSingle(arr));
    }

    // Find the single element method
    static int findSingle(int[] arr) {
        // Base case
        if (arr.length == 1) {
            // If the array length is one return that value.
            return arr[0];
        }
        
        // Start by setting the mid to the middle index of the array
        int mid = (arr.length) / 2;

        // Determine if the mid index is an even or odd index and if we should check the left or right value
        int i = mid % 2 == 0 ? 1 : -1;

        // The checked value should equal mid, indicating correct parttern up to the mid
        if (arr[mid + i] == arr[mid]) {
            // if the pattern is correct then the location of the single value > mid
            // call the findSingle function on a copy of the array from mid to the end of the array
            // excluding the mid value and the checked value
            return findSingle(Arrays.copyOfRange(arr, mid + ((i + 3) / 2), arr.length));
        } else if (arr[mid - i] == arr[mid]) {
            // if the pattern is incorrect then the location of the single value < mid
            // call the findSingle function on a copy of the array from the begining to the mid
            // excluding the mid value and the checked value
            return findSingle(Arrays.copyOfRange(arr, 0, mid - ((i + 1) / 2)));
        } else {
            // if neither the left value, or the right value is the same as the mid, the mid is the single value.
            return arr[mid];
        }
    }
}
