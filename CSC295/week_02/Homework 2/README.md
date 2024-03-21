The purpose of this program was to find an integer value that occurs only once in a non-decreasing array of integer pairs of repeating values. The program takes no input and returns nothing.

# "main" method
This is the main method of the program. It is used to initialize the test arrays, call a function that finds the value that occurs once, and prints that value to the console. It takes no input and returns no value. The method starts by initializing three array literals of small (7), medium (15), and large (29) lengths. Next, the program will print a string literal concatenated with the return value of the findSingle method using the small array as an argument. The program does this again with the medium array, and then the large array. The method then resolves without returning a value.

# "findSingle" method
This is the method to search an array with the pre-established constraints for the value that occurs only once. It takes an input array of integer values and assumes valid input, an input array which does not meet the conditions is not checked and will cause an error. It returns the integer value that occurs only once in the array. This method is recursive. 

The method starts by evaluating the base case. If the length of the input array is one, it only contains the value that occurs once and returns that value. Next, the method declares an integer variable named "mid" and initializes it to the length of the input array divided by 2 representing the middle index of the input array. If "mid" is even, the method declares an integer "i" and sets it equal to 1, if "mid" is odd, "i" id initalized to -1. "i" represents the index, in reference to mid, that should be checked to determine correct ordering of the array. Since a correct array will contain only integer pairs and no single integer, the length of a correct array should always be even and every even index will contain the first integer of the pair. Therefore, if "mid" is even, the method should evaluate the right index (1) for correctness. If "mid" is odd, the method should evaluate the left index (-1) for correctness. Next, the method evaluates an if statement with three possible results. 

The first if statment evaluates the integer located at index "mid" against the integer at the index that should conatin the same value (i.e. mid + i). If this expression is "true" the array up to index "mid" contains only correct values and can be ignored. The remaining values now make up a new array that is a valid argument for the "findSingle" method. As such, the method then returns the result of recursively calling the "findSingle" method using a copy of the orignal input array sliced to contain only the remainging values to the end of the array. Since the value at index "mid" as well as the index of its pair value have been checked, the new array omits those indecies by starting the new copy at either index "mid + 1" for an odd "mid", or "mid + 2" for an even "mid". 

The second if statement is an else if statement that evaluates the integer located at index "mid" against the integer at the index that should not contain the same value (i.e mid - i). If this expression is "true" than the array up to index "mid" contains an incorrect value and must be evaluated. These values now make up a new array that is a vaild argument for the "findSingle" method. As such, the method then returns the result of recursively calling the "findSingle" method using a copy of the orignal input array sliced to contain only the begining of the array to index "mid". Since the value at index "mid" as well as the index of its pair value have been checked, the new array omits those indecies by ending the new copy at either index "mid" for an odd "mid", or "mid - 1" for an even "mid".

The final statement is else statement. This statement evaluates if neither adjacent index matches the integer at index "mid". This means the value at index "mid" is the single value. The method then returns the result of recursively calling the "findSingle" method using a copy of the orignal input array sliced to contain only integer at index "mid".

This method will continue calling recursively until an array of length 1 is passed into the method.

# Methodology / Thought Process
To start solving this problem, I creted 

One issue I ran into early on was an idex out of bounds error when checking indecies adjacent to the mid. If at any time, an array with length 2 was passed in, the "mid" would be set to index 0, and the program would produce an error when checking "mid - i" ("i" would always be +1 because 0 is even). This was because the program was attempting to check outside of the array. To avoid this, I needed to develop a way to always pass a valid array when recursively calling the "findSingle" method which would require slicing the array at different locations depending on if the mid was even or odd and if the slice was to the left or right of the "mid" index. I started by creating an if statement the broke the logic into a case for an odd "mid" index and a case for an even "mid" index. This would allow me to identify how to slice the array in such a way that would remove both the "mid" index and its integer pair since the location of the paired value would change between an even and odd "mid". 

I was able to identify the following cases:
For an even "mid" index and a right sided slice, I would need to pass a copy starting at index "mid + 2" (inclusive) and going to index "arr.length" (exclusive).
For an even "mid" index and a left sided slice, I would need to pass a copy starting at index 0 (inclusive) and going to index "mid + -1" (exclusive).
For an odd "mid" index and a right sided slice, I would need to pass a copy starting at index "mid + 1" (inclusive) and going to index "arr.length" (exclusive).
For an odd "mid" index and a left sided slice, I would need to pass a copy starting at index 0 (inclusive) and going to index "mid + 0" (exclusive).

Breaking the recursive call into four cases was able to solve this problem and always pass an array with valid parameters. However, I wanted to find a way to conslidate the cases into only two

Since I previously had a way to create one if statement that handled both even and odd indexed mids, I knew that I could use the previously declared variable "i" to adjust the slice start or end based on an even or odd "mid". I just needed the proper equation to do this.

if arr[0:mid] == correct order:
    right sided slice: 
        even: f(1) = 2;
        odd: f(-1) = 1;
else
    left sided slice
        even: g(1) = -1
        odd: g(-1) = 0

Using linear algebra I could then develop an equation that for f(i) both (1,2) and (-1, 1) would be true and for g(i) both (1, -1) and (-1, 0) would be true.

For this I was able to get f(i) = (1/2)i + 3/2 and g(i) = (-1/2)i - 1/2, but since I was using int data types, I would need to adjust the equations to never evaluate to a decimal. To adjust this, I changed f(i) to (i + 3)/2 and g(i) to -(i+1)/2.