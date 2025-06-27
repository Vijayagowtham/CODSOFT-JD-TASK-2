import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            
            int[] marks = new int[numSubjects];
            int totalMarks = 0;
            
            // Input marks for each subject
            for (int i = 0; i < numSubjects; i++) {
                while (true) {
                    System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                    int inputMark = scanner.nextInt();
                    
                    if (inputMark >= 0 && inputMark <= 100) {
                        marks[i] = inputMark;
                        totalMarks += inputMark;
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter marks between 0 and 100.");
                    }
                }
            }

            // Display marks for each subject
            System.out.println("\nMarks for each subject:");
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }
            
            double averagePercentage = (double) totalMarks / numSubjects;
            char grade;
            
            // Grade calculation
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else if (averagePercentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            // Display results
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
            System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
            System.out.println("Grade: " + grade);
        }
    }
}
