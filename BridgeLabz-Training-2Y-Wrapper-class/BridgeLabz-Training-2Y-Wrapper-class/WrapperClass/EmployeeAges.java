import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 32, 45, 29, 41};

        ArrayList<Integer> list = new ArrayList<>();
        for (int age : ages) list.add(age); // Auto-boxing

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}

