import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Auto-boxing (primitive → wrapper)
        for (int i = 1; i <= 10; i++) numbers.add(i);

        int sum = 0;
        // Auto-unboxing (wrapper → primitive)
        for (int n : numbers) sum += n;

        System.out.println("Sum of numbers = " + sum);
    }
}
