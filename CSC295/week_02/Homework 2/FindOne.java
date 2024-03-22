// Tyler J. Teichmann

// Import the array module
import java.util.Arrays;

// Main program class
public class FindOne {

    // main method
    public static void main(String[] args) {
        // Initialize the small array
        int[] small_arr = {1, 1, 2, 2, 6, 8, 8};
        // Initialize the medium array
        int[] medium_arr = {1, 1, 2, 2, 6, 6, 8, 8, 9, 9, 10, 10, 11, 14, 14};
        // Initialize the large array
        int[] large_arr = {1, 1, 2, 2, 6, 6, 8, 8, 9, 9, 10, 10, 11, 11, 14, 14, 30, 30, 41, 41, 59, 59, 63, 63, 67, 71, 71, 99, 99};

        // Print the value of the single value in the small array
        System.out.println("The single value of the small array is " + findSingle(small_arr));
        // Print the value of the single value in the medium array
        System.out.println("The single value of the medium array is " + findSingle(medium_arr)); 
        // Print the value of the single value in the large array
        System.out.println("The single value of the large array is " + findSingle(large_arr));
    }

    // Find the single element method
    static int findSingle(int[] arr) {
        // Base case
        if (arr.length == 1) {
            // If the array length is one and the only value remaining is the single value. Return that value.
            return arr[0];
        }
        
        // Start by setting the mid to the middle index of the array
        int mid = arr.length / 2;

        // Determine if the mid index is an even or odd index and if we should check the left (mid-1) or right (mid+1) value
        int i = mid % 2 == 0 ? 1 : -1;

        // Check if the value to the left or right (depending on i and if the mid index is odd or even) is equal to the mid.
        if (arr[mid + i] == arr[mid]) {
            // if the pattern is correct then the location of the single value > mid
            // call the findSingle function on a copy of the array from mid to the end of the array
            // "+ ((i + 3) / 2)" will exclude the mid, and any adjacent duplicate value
            return findSingle(Arrays.copyOfRange(arr, mid + ((i + 3) / 2), arr.length));
        // If the last value was not correct, check to make sure that the other value is equal to the mid
        } else if (arr[mid - i] == arr[mid]) {
            // if the pattern is incorrect then the location of the single value < mid
            // call the findSingle function on a copy of the array from beginning of the array to the mid
            // "+ ((i + 1) / 2)" will exclude the mid, and any adjacent duplicate value
            return findSingle(Arrays.copyOfRange(arr, 0, mid + (-(i + 1) / 2)));
        // If neither value to the left or right is equal to the mid, the mid is the single value.
        } else {
            // Return the single value at mid index.
            return findSingle(Arrays.copyOfRange(arr, mid, mid + 1));
        }
    }
}
