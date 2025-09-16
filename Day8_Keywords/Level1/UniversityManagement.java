class Student {
    
    static String universityName = "ABC University";
    static int totalStudents = 0;

   
    private String name;
    private final int rollNumber; 
    private String grade;

   
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }

    
    
    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }

    
    void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for " + name + ": " + grade);
    }

   
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
        
        Student s1 = new Student("Raj Verma", 101, "A");
        Student s2 = new Student("Simran Kaur", 102, "B");

       
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade("A+");
        }

        if (s2 instanceof Student) {
            s2.displayDetails();
        }

       
        Student.displayTotalStudents();
    }
}
