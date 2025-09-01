
import java.util.Random;

public class StudentAges {
    // Generate random ages
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 15 + rand.nextInt(10); // Age between 15-24
        }
        return ages;
    }

    // Convert to 2D array (valid/invalid age check)
    static String[][] validateAges(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Valid Vote" : "Not Eligible";
        }
        return result;
    }

    // Display table
    static void display(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Age", "Voting Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = validateAges(ages);
        display(result);
    }
}
