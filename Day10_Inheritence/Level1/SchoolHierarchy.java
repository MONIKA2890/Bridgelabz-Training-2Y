
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main
public class SchoolHierarchy {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Mathematics");
        Student s = new Student("Bob", 16, "10th Grade");
        Staff st = new Staff("Charlie", 40, "Administration");

        t.displayRole();
        System.out.println("-----------------");
        s.displayRole();
        System.out.println("-----------------");
        st.displayRole();
    }
}

