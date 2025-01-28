import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the grade for course " + (i + 1) + " (A, B, C, D, F): ");
            String grade = scanner.next().toUpperCase();

            System.out.print("Enter the number of credits for course " + (i + 1) + ": ");
            int credits = scanner.nextInt();

            double points = getPoints(grade) * credits;
            totalPoints += points;
            totalCredits += credits;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("Your GPA is: %.2f%n", gpa);
    }

    public static double getPoints(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
}


