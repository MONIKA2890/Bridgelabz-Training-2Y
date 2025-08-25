import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        int counter = num - 1;
        int greatestFactor = 1;

        while (counter >= 1) {
            if (num % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor (excluding itself): " + greatestFactor);
        sc.close();
    }
}
