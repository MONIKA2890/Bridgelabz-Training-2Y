
class Employee {
    String name;
    int id;
    double salary;

    
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Manager");
    }
}


class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Role: Developer");
    }
}


class Intern extends Employee {
    int duration; // in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
        System.out.println("Role: Intern");
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 75000, 10);
        Employee e2 = new Developer("Bob", 102, 55000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, 6);

        System.out.println("=== Employee Details ===");
        e1.displayDetails();
        System.out.println("------------------------");
        e2.displayDetails();
        System.out.println("------------------------");
        e3.displayDetails();
    }
}

