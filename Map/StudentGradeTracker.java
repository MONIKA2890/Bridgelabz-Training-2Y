import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

       
        Map<String, Double> grades = new HashMap<>();

       
        grades.put("Riya", 85.5);
        grades.put("Aman", 92.0);
        grades.put("Monika", 78.0);
        grades.put("Sahil", 88.5);

        System.out.println("Initial Grades: " + grades);

       
        System.out.println("\nUpdating Monika's grade...");
        grades.put("Monika", 90.0); 

        
        System.out.println("Removing Sahil from list...");
        grades.remove("Sahil");

        
        System.out.println("\nStudents and Grades (Alphabetical Order):");

    
        Map<String, Double> sortedGrades = new TreeMap<>(grades);

        for (Map.Entry<String, Double> entry : sortedGrades.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

