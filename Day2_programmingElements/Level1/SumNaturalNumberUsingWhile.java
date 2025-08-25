import java.util.Scanner;
public class SumNaturalNumberUsingWhile {
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

        // Using while loop
        int i = 1, loopSum = 0;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);
        sc.close();
    }
}

