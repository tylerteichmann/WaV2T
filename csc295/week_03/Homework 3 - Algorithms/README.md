# Methodology
To adapt the sorting algorithms that we had created in class I had to change the parameters, adjust the names, and reverse the size logic.

First, for each of the four sorting algorithms that we created in class, I changed the input parameters from an array of integers (int[] arr) to an array of Students (Student[] students). This allowed the algorithms to take the students array I created in main as input.

Second, since I changed the name of my array from arr to students, I had to ensure the name was adjusted for each algorithm. Furthermore, since the value at each index is only an address pointing to the Student objects, I needed to use dot notation to access the GPA instance variable in any line of code that was comparing two indices.

Third, because the sorting algorithms we designed in class sorted the arrays into non-descending order, I needed to adjust the comparisons to sort the array into descending order.
# Challenges
The main challenge I faced during this assignment was accurately describing in comments what each sorting algorithm was doing for each line of code. Using notes from class and online resources, I was able to describe what each line of code was doing in each algorithm.

Another challenge I ran into that wasn't required for the assignment was to use a constructor for creating the students in an array literal instead  of manually adding all the information after creating each instance. To do this I added a constructor in the Student.java file that takes the students name, and a gpa as arguments when creating the student. I used W3 schools to learn how to create the constructor method in java.
# Outputs
Please input the algorithm you would like to use.
bubble
1: Tina 3.98
2: Steven 3.67
3: Tyler 3.58
4: Joe 3.16
5: Zac 2.96
Algorithm used: bubble

Please input the algorithm you would like to use.
selection
1: Tina 3.98
2: Steven 3.67
3: Tyler 3.58
4: Joe 3.16
5: Zac 2.96
Algorithm used: selection

Please input the algorithm you would like to use.
insertion
1: Tina 3.98
2: Steven 3.67
3: Tyler 3.58
4: Joe 3.16
5: Zac 2.96
Algorithm used: insertion

Please input the algorithm you would like to use.
Merge
1: Tina 3.98
2: Steven 3.67
3: Tyler 3.58
4: Joe 3.16
5: Zac 2.96
Algorithm used: merge