# CSGradeCalculater
Overview
CSGradeCalculator is a Java program designed to calculate the average of a user-defined number of grades. It validates user input, handles exceptions gracefully, and ensures all entered grades are within the valid range of 0 to 100.

Features
User-Friendly Input Validation:
Ensures the number of grades is a positive integer.
Checks that each grade is a numeric value between 0 and 100.
Exception Handling:
Catches invalid inputs using InputMismatchException and prompts the user to re-enter the data.
Dynamic Calculation:
Supports calculating averages for any number of grades based on user input.
Summary Output:
Displays the average grade with two decimal places.
Program Flow
Input Number of Grades:
The user is prompted to enter how many grades they wish to calculate.
Only positive integers are accepted.
Enter Grades:
The user enters grades one at a time.
Each grade is validated to be within the range of 0 to 100.
Calculate Average:
The program computes the average of the entered grades.
Display Results:
The calculated average is displayed.
Completion:
A closing message is displayed with the program's credits.
Customization
Grade Range:
Update the if (grade >= 0 && grade <= 100) condition to change the acceptable range for grades.
Message Personalization:
Modify the System.out.println statements to customize instructions and feedback.
Learning Objectives
Implement input validation and exception handling in Java.
Work with loops and conditionals to create a user-friendly experience.
Perform dynamic array operations and basic arithmetic.
