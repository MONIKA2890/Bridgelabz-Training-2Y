import java.util.*;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();

            members[i][2] = calculateBMI(members[i][0], members[i][1]);
        }

        System.out.println("\nMember Data:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) +
                " | Weight: " + members[i][0] + "kg" +
                " | Height: " + members[i][1] + "cm" +
                " | BMI: " + members[i][2] +
                " | Status: " + getStatus(members[i][2]));
        }
        sc.close();
    }
}
