public class StudentGrades {
    // Method to calculate grade based on marks
    public static char calculateGrade(double marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'R'; // Failed
        }
    }
    
    // Method to get remarks based on grade
    public static String getRemarks(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent";
            case 'B':
                return "Very Good";
            case 'C':
                return "Good";
            case 'D':
                return "Average";
            case 'E':
                return "Pass";
            case 'R':
                return "Fail";
            default:
                return "Invalid Grade";
        }
    }
    
    // Test the methods
    public static void main(String[] args) {
        int numStudents = 10;
        double[][] students = new double[numStudents][3]; // [studentId, marks, grade]
        
        // Initialize student data
        for (int i = 0; i < numStudents; i++) {
            students[i][0] = i + 1; // Student ID
            students[i][1] = Math.random() * 100; // Marks between 0 and 100
            students[i][2] = calculateGrade(students[i][1]); // Grade
        }
        
        // Display student data
        System.out.println("Student ID\tMarks\t\tGrade\tRemarks");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            char grade = (char)students[i][2];
            System.out.printf("%d\t\t%.2f\t\t%c\t%s\n", 
                             (int)students[i][0], students[i][1], grade, getRemarks(grade));
        }
    }
}