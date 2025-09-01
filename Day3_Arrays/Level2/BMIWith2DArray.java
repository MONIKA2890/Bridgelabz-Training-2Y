import java.util.Scanner;

public class BMIWith2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // personData[i][0] = height, personData[i][1] = weight, personData[i][2] = BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double height, weight;
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            } while (height <= 0 || weight <= 0);

            double bmi = weight / (height * height);

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            weightStatus[i] = status;
        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][0] + " m, " +
                    "Weight=" + personData[i][1] + " kg, BMI=" + String.format("%.2f", personData[i][2]) +
                    ", Status=" + weightStatus[i]);
        }

        sc.close();
    }
}
