import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        // Using formula
        int formulaSum = n * (n + 1) / 2;

        // Using for loop
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);
        sc.close();
    }
}