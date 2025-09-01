import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        int[] years = new int[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            years[i] = sc.nextInt();

            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] +
                    ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}

