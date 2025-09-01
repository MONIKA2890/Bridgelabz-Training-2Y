import java.util.*;

public class BMIReport {
    // Read inputs: col0 = weight(kg), col1 = height(cm)
    static double[][] readInputs(Scanner sc, int n) {
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i+1) + " weight(kg): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height(cm): ");
            hw[i][1] = sc.nextDouble();
        }
        return hw;
    }

    static double bmi(double wtKg, double htCm) {
        double hM = htCm / 100.0;
        return wtKg / (hM * hM);
    }

    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    // Build 2D String table: Height, Weight, BMI, Status
    static String[][] buildReport(double[][] hw) {
        int n = hw.length;
        String[][] table = new String[n][4];
        for (int i = 0; i < n; i++) {
            double wt = hw[i][0], ht = hw[i][1];
            double b = bmi(wt, ht);
            table[i][0] = String.format("%.1f", ht);
            table[i][1] = String.format("%.1f", wt);
            table[i][2] = String.format("%.2f", b);
            table[i][3] = status(b);
        }
        return table;
    }

    static void printTable(String[][] t) {
        System.out.printf("%-10s %-10s %-10s %-12s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (String[] row : t) {
            System.out.printf("%-10s %-10s %-10s %-12s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = readInputs(sc, 10);
        printTable(buildReport(hw));
        sc.close();
    }
}

