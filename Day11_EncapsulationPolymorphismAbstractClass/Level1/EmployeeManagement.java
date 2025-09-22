
import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", BaseSalary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double monthlyBonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double monthlyBonus) {
        super(id, name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: FullTime, Dept: " + department + ", Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getEmployeeId() + ", Name: " + getName() + ", Type: PartTime, Salary: " + calculateSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee("FT001","Asha",50000,5000);
        f1.assignDepartment("HR");
        employees.add(f1);
        employees.add(new PartTimeEmployee("PT001","Ravi",250,80));

        for (Employee e : employees) {
            e.displayDetails(); // polymorphic call
            System.out.println();
        }
    }
}
