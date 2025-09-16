class Employee {
    
    static String companyName = "BridgeLabz";
    static int totalEmployees = 0;

   
    private String name;
    private final int id; 
    private String designation;

   
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;   
        this.designation = designation;
        totalEmployees++;
    }

    
    void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
        System.out.println("-------------------------");
    }

    
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}


public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Noor", 101, "Engineer");
        Employee e2 = new Employee("Aman", 102, "Manager");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        Employee.displayTotalEmployees();  
    }
}

