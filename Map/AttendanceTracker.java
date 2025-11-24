import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {

        
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Aman", "Riya", "Sohan", "Pooja", "Karan");

        for (String s : students) {
            attendance.put(s, 0);
        }

        Random random = new Random();

       
        for (int day = 1; day <= 15; day++) {
            System.out.println("\nDay " + day + " attendance:");

           
            List<String> presentToday = new ArrayList<>();

            for (String s : students) {
                if (random.nextBoolean()) {      
                    presentToday.add(s);
                }
            }

            System.out.println("Present: " + presentToday);

           
            for (String name : presentToday) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

       
        System.out.println("\n=== Attendance Summary ===");
        for (String s : students) {
            System.out.println(s + " -> " + attendance.get(s) + " days");
        }

       
        System.out.println("\n=== Students Present Fewer Than 10 Days ===");
        for (String s : students) {
            if (attendance.get(s) < 10) {
                System.out.println(s + " (" + attendance.get(s) + " days)");
            }
        }
    }
}

