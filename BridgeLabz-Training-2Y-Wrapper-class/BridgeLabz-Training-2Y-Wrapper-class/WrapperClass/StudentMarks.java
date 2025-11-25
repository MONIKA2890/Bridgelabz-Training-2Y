import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        List<Integer> marks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj == null || obj.equals("null")) continue;
                if (obj instanceof Integer) marks.add((Integer) obj);
                else marks.add(Integer.parseInt(obj.toString()));
            } catch (Exception e) {
                // Ignore invalid entries
            }
        }

        double avg = marks.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average Marks: " + avg);
    }
}
