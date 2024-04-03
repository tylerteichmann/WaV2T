//Tyler J. Teichmann

// Import the scanner object
import java.util.Scanner;

// Main class of program
public class Main {
    // main method for program
    public static void main(String[] args) {
        // Instantiate array of 5 student objects.
        Student[] students = {
            // Student 1 named Tyler with a random GPA between 0 and 4, rounded to the nearest 100th.
            new Student("Tyler", 3.58),
            // Student 2 named Tina with a random GPA between 0 and 4, rounded to the nearest 100th.
            new Student("Tina", 3.98),
            // Student 3 named Joe with a random GPA between 0 and 4, rounded to the nearest 100th.
            new Student("Joe", 3.16),
            // Student 4 named Zac with a random GPA between 0 and 4, rounded to the nearest 100th.
            new Student("Zac", 2.96),
            // Student 5 named Steven with a random GPA between 0 and 4, rounded to the nearest 100th.
            new Student("Steven", 3.67),
        };

        // Create new scanner object called scanner to read input from the user on which algorithm to use.
        Scanner scanner = new Scanner(System.in);

        // Ask the user which algorithm to use
        System.out.println("Please input the algorithm you would like to use.\n Bubble\n Selection \n Insertion \n Merge \n Quick");
        // Store the users response in a variable called algorithm
        String algorithm = scanner.nextLine().toLowerCase();
        // Close the scanner
        scanner.close();

        // Create a switch function that will evaluate which algorithm to call based on the users input
        switch (algorithm) {
            // Case one is if the user enters "bubble"
            case "bubble":
                // call the BubbleSort algorithm
                BubbleSort(students);
                // Break out of the switch
                break;
            // Case two is if the user enters "selection"
            case "selection":
                // Call the SelectionSort method
                SelectionSort(students);
                // Break out of the switch
                break;
            // Case three is if the user enters "insertion"
            case "insertion":
                // Call the InsertionSort method
                InsertionSort(students);
                // Break out of the switch
                break;
            // Case four is if the user enters "merge"
            case "merge":
                // Call the MergeSort method
                MergeSort(students);
                // Break out of the switch
                break;
            // Case five is if the user enters "quick"
            case "quick":
                // Call the QuickSort method
                QuickSort(students);
                // Break out of the switch
                break;
            // The default case is if the user enters something else.
            default:
                // Inform the user they did not enter a correct algorithm
                System.out.println("Invalid algorithm...");
                // exit the program.
                return;
        }

        // Iterate over the students array
        for (int i = 0; i < students.length; i++){
            // Print the name of the student and their GPA
            System.out.println(i + 1 + ": " + students[i].name + " " + students[i].gpa);
        }
        // Print the algorithm that was used to complete the sort
        System.out.println("Algorithm used: " + algorithm);
    }

    // Bubble sort algorithm
    public static void BubbleSort (Student[] students) {
        // Iterate the number of times equal to the length of the array minus 1
        for (int i = 1; i < students.length; i++) {
            // For each iteration, loop through the entire array except for the last i elements because they have already been sorted
            for (int j = 0; j < students.length - i; j++) {
                // If the student object at index j's gpa is less than the students at index j + 1 swap the values
                if (students[j].gpa < students[j + 1].gpa) {
                    // Swap the students
                    Swap(students, j, j + 1);
                }
            }
        }
    }

    // Selection sort algorithm
    public static void SelectionSort(Student[] students) {
        // Loop through the array
        for (int i = 0; i < students.length; i++) {
            // Create a variable called max that stores the index of the max value. Set it equal to the current index
            int max = i;

            // loop through the rest of the array to find the index of the max value
            for (int j = i + 1; j < students.length; j++) {
                // if a value is bigger than the value at the current index of the max value
                if (students[j].gpa > students[max].gpa) {
                    // Set the max equal to the index of the new largest value
                    max = j;
                }
            }

            // Swap the students
            Swap(students, i, max);
        }
    }

    // Insertion sort algorithm
    public static void InsertionSort (Student[] students) {
        // Create int j to store the
        int j;
        // Loop through the entire array of students
        for (int i = 0; i < students.length; i++) {
            // Create a temporary variable to store the student at the current index
            Student temp = students[i];

            // Loop backwards through the array starting at the current index until the beginning of the array is reached, or a student with a higher gpa is found
            for (j = i; j > 0 && students[j - 1].gpa < temp.gpa; j--) {
                // The student at j - 1 has a lower gpa, so move them further down in the array
                students[j] = students[j - 1];
            }

            // wherever index j stops at is the location where the student at the current index should be inserted
            students[j] = temp;
        }
    }

    // Merge sort algorithm
    public static void MergeSort (Student[] students) {
        // Create a variable to store the length of the current student array
        int length = students.length;

        // Base Case: the array is of length one (i.e. it is sorted)
        if (length <= 1) {
            // Return
            return;
        }

        // Create a variable to store the middle index of the current array of students
        int mid = length / 2;
        // Create a new array the length of mid that will store the left side of the array (i.e. students[0, mid) )
        Student[] leftArray = new Student[mid];
        // Create a new array the length of the first array - mid that will store the right side of the array (i.e. students[mid, students.length)
        Student[] rightArray = new Student[length - mid];

        // index to keep track for our left array
        int l = 0;
        // index to keep track for our right array
        int r = 0;
        // the following for loop populates both arrays. Alternatively can use Array.copyOfRange(arr, start, end).
        for (; l < length; l++) {
            // if l < mid, we are on the left side of the array
            if(l < mid){
                // add the student at that index into the left array at the same index
                leftArray[l] = students[l];
            // else we are on the right side of the array
            } else {
                // add the student at that index into the right array at the index of r
                rightArray[r] = students[l];
                // increment r
                r++;
            }
        }

        // Recursively call the MergeSort method on the remaining left side. this will return a sorted array
        MergeSort(leftArray);
        // Recursively call the MergeSort method on the remaining right side. this will return a sorted array
        MergeSort(rightArray);
        // Call the merge method to merge the two sides of the array into the base array
        Merge(leftArray, rightArray, students);
        // Input array has been sorted, return
        return;
    }   

    // Merge method for the merge algorithm
    public static void Merge(Student[] leftArray, Student[] rightArray, Student[] students) {
        // Create a variable that is the size of the left side of the array
        int leftArraySize = leftArray.length;
        // Create a variable that is the size of the right side of the array
        int rightArraySize = rightArray.length;

        // initialize three cursor variables to track the index of each array
        int i = 0, l = 0, r = 0;

        // while the left array's index is in a valid location and the right array's index is also in a valid position
        while (l < leftArraySize && r < rightArraySize) {
            // if the student in the left array has a bigger gpa
            if (leftArray[l].gpa > rightArray[r].gpa) {
                // add the student to the current index of the combined array then increment both cursors
                students[i++] = leftArray[l++];
            } else {
                // add the student in the right array to the combined array then increment both cursors
                students[i++] = rightArray[r++];
            }
        }

        // Once one array is empty, place the remaining values in the other array into the combined array
        while(l < leftArraySize){
            // Add the student where the cursor left off and increment until the end
            students[i++] = leftArray[l++];
        }
        // Once one array is empty, place the remaining values in the other array into the combined array
        while(r < rightArraySize){
            // Add the student where the cursor left off and increment until the end
            students[i++] = rightArray[r++];
        }
    }

    // Quick sort algorithm container
    public static void QuickSort(Student[] students) {
        // Call the RecursiveQuickSort method
        RecursiveQuickSort(students, 0, students.length - 1);
    }

    // Will recursively call itself to perform Quick Sort operation
    public static void RecursiveQuickSort(Student[] students, int low, int high) {
        // Base case if statement
        if (low < high) {
            // choose our pivot
            int pivot = high;
            
            // set the position for the smaller element
            int i = low - 1;
            
            // j will go through each of the elements in the current sub array being evaluated
            // it should start at low and end at high (inclusive)
            for(int j = low; j <= high; j++) {
                // check if j is greater than pivot
                if (students[j].gpa > students[pivot].gpa){
                    // Increment i
                    i++;
                    // Swap the indices
                    Swap(students, j, i);
                } 
            }
            
            // Swap the pivot to the index i + 1
            Swap(students, ++i, high);
            
            // Call the QuickSort method recursively on the left side of the pivot
            RecursiveQuickSort(students, low, i - 1);
            // Call the QuickSort method recursively on the right side of the pivot
            RecursiveQuickSort(students, i + 1, high);
        }
    }

    // Quick method to swap array indices
    public static void Swap(Student[] students, int i, int j) {
        // Create temporary Student object for first student
        Student temp = students[i];
        // Set index of first student to the second student
        students[i] = students[j];
        // Set index of the second student to the first student
        students[j] = temp;
    }
}