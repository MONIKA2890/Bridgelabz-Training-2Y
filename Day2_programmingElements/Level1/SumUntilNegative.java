import java.util.Scanner;
public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        while (true) {
            System.out.println("Enter a number (0 or negative to stop):");
            double num = sc.nextDouble();

            if (num <= 0) break;
            sum += num;
        }

        System.out.println("Total sum: " + sum);
        sc.close();
    }
}
