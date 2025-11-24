import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {

   
        Map<String, Double> salaryMap = new HashMap<>();

        salaryMap.put("Alice", 50000.0);
        salaryMap.put("Bob", 62000.0);
        salaryMap.put("Charlie", 45000.0);
        salaryMap.put("David", 72000.0);
        salaryMap.put("Eve", 69000.0);
        salaryMap.put("Frank", 52000.0);

        
        giveRaise(salaryMap, "Alice", 10);     // +10%
        giveRaise(salaryMap, "Charlie", 5);    // +5%
        giveRaise(salaryMap, "David", 8);      // +8%
        giveRaise(salaryMap, "Unknown", 20);   // not found

      
        System.out.println("\nUpdated Employee Salaries:");
        for (String emp : salaryMap.keySet()) {
            System.out.println(emp + " → " + salaryMap.get(emp));
        }

       
        double avg = computeAverage(salaryMap);
        System.out.println("\nAverage Salary = " + avg);

       
        System.out.println("\nHighest Paid Employee(s):");
        printHighestPaid(salaryMap);
    }

  
    public static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (map.containsKey(name)) {
            double newSalary = map.get(name) + (map.get(name) * percent / 100);
            map.put(name, newSalary);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }

   
    public static double computeAverage(Map<String, Double> map) {
        double total = 0;
        for (double salary : map.values()) {
            total += salary;
        }
        return total / map.size();
    }

   
    public static void printHighestPaid(Map<String, Double> map) {
        double maxSalary = Collections.max(map.values());

        for (String name : map.keySet()) {
            if (map.get(name) == maxSalary) {
                System.out.println(name + " → " + map.get(name));
            }
        }
    }
}

