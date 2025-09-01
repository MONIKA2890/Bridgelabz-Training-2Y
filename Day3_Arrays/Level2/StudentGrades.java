import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            int p, c, m;
            do {
                System.out.print("Enter marks of student " + (i + 1) + " in Physics: ");
                p = sc.nextInt();
                System.out.print("Enter marks in Chemistry: ");
                c = sc.nextInt();
                System.out.print("Enter marks in Maths: ");
                m = sc.nextInt();
            } while (p < 0 || c < 0 || m < 0);

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentage[i] = (p + c + m) / 3.0;

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
                    ": Physics=" + physics[i] +
                    ", Chemistry=" + chemistry[i] +
                    ", Maths=" + maths[i] +
                    ", %=" + String.format("%.2f", percentage[i]) +
                    ", Grade=" + grade[i]);
        }

        sc.close();
    }
}
