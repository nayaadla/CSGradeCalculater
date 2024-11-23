
import java.util.InputMismatchException;
import java.util.Scanner;

public class CSGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfGrades = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the number of grades you want to calculate: ");
                numberOfGrades = scanner.nextInt();
                if (numberOfGrades > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }

        double[] grades = new double[numberOfGrades];
        double sum = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            double grade = -1;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter grade " + (i + 1) + " (0 - 100): ");
                    grade = scanner.nextDouble();
                    if (grade >= 0 && grade <= 100) {
                        grades[i] = grade;
                        sum += grade;
                        validInput = true;
                    } else {
                        System.out.println("Grade must be between 0 and 100.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }
        }

        double average = sum / numberOfGrades;

        System.out.printf("The average grade is: %.2f%n", average);

        scanner.close();
        
        System.out.println("\n_________");
        System.out.println("Go Hatters!!");
        System.out.println("Program by: Naya Adla");
        System.out.println("_________");
    }
}
