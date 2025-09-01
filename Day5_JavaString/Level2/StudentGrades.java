
import java.util.Random;

public class StudentGrades {
    static final int STUDENTS = 5;
    static final int SUBJECTS = 3; // Physics, Chemistry, Math

    public static void main(String[] args) {
        int[][] marks = generateMarks(STUDENTS, SUBJECTS);
        displayScorecard(marks);
    }

    // Generate random marks (50-100)
    static int[][] generateMarks(int students, int subjects) {
        Random rand = new Random();
        int[][] arr = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                arr[i][j] = 50 + rand.nextInt(51);
            }
        }
        return arr;
    }

    // Calculate grade
    static String calculateGrade(double percent) {
        if (percent >= 90) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    // Display Scorecard
    static void displayScorecard(int[][] marks) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                total += marks[i][j];
            }
            double avg = total / 3.0;
            double percent = (total / (SUBJECTS * 100.0)) * 100;
            String grade = calculateGrade(percent);

            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    total, avg, percent, grade);
        }
    }
}
