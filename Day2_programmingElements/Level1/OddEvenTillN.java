import java.util.Scanner;
public class OddEvenTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter n > 0");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
        sc.close();
    }
}
