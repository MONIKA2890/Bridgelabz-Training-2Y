import java.util.*;

public class ExamResults {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> exam = new HashMap<>();

       
        exam.put("Math", Map.of("Alice", 88, "Bob", 92, "Charlie", 79));
        exam.put("Science", Map.of("Alice", 90, "Bob", 85, "Charlie", 95));
        exam.put("English", Map.of("Alice", 76, "Bob", 89, "Charlie", 82));

       
        System.out.println("Top Scorer per Subject:");
        for (String subject : exam.keySet()) {
            Map<String, Integer> marks = exam.get(subject);

            String topper = Collections.max(marks.entrySet(), Map.Entry.comparingByValue()).getKey();
            int topMarks = marks.get(topper);

            System.out.println(subject + ": " + topper + " (" + topMarks + ")");
        }

       
        System.out.println("\nAverage Score per Subject:");
        for (String subject : exam.keySet()) {
            Map<String, Integer> marks = exam.get(subject);

            int sum = 0;
            for (int m : marks.values()) sum += m;

            double avg = sum / (double) marks.size();
            System.out.println(subject + ": " + avg);
        }

      
        System.out.println("\nSubjects where at least one student scored above 90:");
        for (String subject : exam.keySet()) {
            for (int m : exam.get(subject).values()) {
                if (m > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }
}

