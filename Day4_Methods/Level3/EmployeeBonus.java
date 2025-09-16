public class EmployeeBonus {
    // Method to calculate bonus for an employee
    public static double calculateBonus(double salary) {
        // Bonus is a random percentage between 5% and 15% of salary
        double bonusPercentage = 5 + Math.random() * 10; // 5% to 15%
        return salary * bonusPercentage / 100;
    }
    
    // Test the method
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employees = new double[numEmployees][3]; // [employeeId, salary, bonus]
        
        // Initialize employee data
        for (int i = 0; i < numEmployees; i++) {
            employees[i][0] = i + 1; // Employee ID
            employees[i][1] = 30000 + Math.random() * 70000; // Salary between 30000 and 100000
            employees[i][2] = calculateBonus(employees[i][1]); // Bonus
        }
        
        // Display employee data
        System.out.println("Employee ID\tSalary\t\tBonus");
        System.out.println("-------------------------------------------");
        
        double totalBonus = 0;
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%d\t\t%.2f\t%.2f\n", 
                             (int)employees[i][0], employees[i][1], employees[i][2]);
            totalBonus += employees[i][2];
        }
        
        System.out.println("-------------------------------------------");
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }
}