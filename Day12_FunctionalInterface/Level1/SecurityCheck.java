interface SensitiveData {}  

class EmployeeRecord implements SensitiveData {
    String ssn = "ABCD12345";
    String salary = "₹50,000";
}

public class SecurityCheck {
    public static void main(String[] args) {
        EmployeeRecord emp = new EmployeeRecord();

        if (emp instanceof SensitiveData) {
            System.out.println("Encrypt this record before storage.");
        } else {
            System.out.println("No encryption needed.");
        }
    }
}

