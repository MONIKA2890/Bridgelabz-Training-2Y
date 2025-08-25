import java.util.Scanner;
public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (less than 100): ");
        int number = sc.nextInt();

        int counter = 99;
        while (counter > 1) {
            if (counter % number == 0) {
                System.out.println(counter);
                // continue (optional here as it's the last statement in loop)
            }
            counter--;
        }
    }
}
