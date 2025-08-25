import java.util.Scanner;
public class FactorUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        int i = 1;
        System.out.println("Factors of " + num + ":");
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
    }
}
