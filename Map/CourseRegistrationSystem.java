import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {

       
        Map<String, Integer> courseMap = new HashMap<>();

        courseMap.put("CS101", 45);
        courseMap.put("CS102", 52);
        courseMap.put("MA101", 12);
        courseMap.put("PH101", 3);
        courseMap.put("EC201", 48);

       

       
        addStudent(courseMap, "CS101");
        addStudent(courseMap, "EC201");
        addStudent(courseMap, "PH101");

       
        dropStudent(courseMap, "MA101");
        dropStudent(courseMap, "PH101");

       
        System.out.println("\nUpdated Course Registrations:");
        for (String course : courseMap.keySet()) {
            System.out.println(course + " → " + courseMap.get(course) + " students");
        }

       
        System.out.println("\n=== Near Full Courses (≥ 50 students) ===");
        for (String course : courseMap.keySet()) {
            if (courseMap.get(course) >= 50) {
                System.out.println(course + " → " + courseMap.get(course));
            }
        }

        System.out.println("\n=== Under-Subscribed Courses (< 5 students) ===");
        for (String course : courseMap.keySet()) {
            if (courseMap.get(course) < 5) {
                System.out.println(course + " → " + courseMap.get(course));
            }
        }
    }

   
    public static void addStudent(Map<String, Integer> map, String course) {
        map.put(course, map.getOrDefault(course, 0) + 1);
    }

    
    public static void dropStudent(Map<String, Integer> map, String course) {
        int current = map.getOrDefault(course, 0);
        if (current > 0) {
            map.put(course, current - 1);
        }
    }
}

