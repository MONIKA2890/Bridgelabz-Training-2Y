import java.util.*;

public class EmployeeDepartment {
    public static void main(String[] args) {

        HashMap<Integer, String> empDept = new HashMap<>();

       
        empDept.put(101, "HR");
        empDept.put(102, "Finance");
        empDept.put(103, "IT");
        empDept.put(104, "IT");
        empDept.put(105, "Marketing");

       
        empDept.put(104, "Finance"); 

       
        System.out.println("Employees in Finance:");
        for (int id : empDept.keySet()) {
            if (empDept.get(id).equals("Finance"))
                System.out.println(id);
        }

        
        HashMap<String, Integer> deptCount = new HashMap<>();

        for (String dept : empDept.values())
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);

        System.out.println("\nDepartment-wise Employee Count:");
        for (String dept : deptCount.keySet()) {
            System.out.println(dept + " → " + deptCount.get(dept));
        }
    }
}

