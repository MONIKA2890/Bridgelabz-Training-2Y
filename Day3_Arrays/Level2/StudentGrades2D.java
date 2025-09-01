import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // marks[i][0] = Physics, marks[i][1] = Chemistry, marks[i][2] = Maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter marks of student " + (i + 1) + " in " + subject + ": ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'F';
        }

        System.out.println("\nStudent Report:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    ": Physics=" + marks[i][0] +
                    ", Chemistry=" + marks[i][1] +
                    ", Maths=" + marks[i][2] +
                    ", %=" + String.format("%.2f", percentage[i]) +
                    ", Grade=" + grade[i]);
        }

        sc.close();
    }
}
