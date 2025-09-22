import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        }
        sc.close();
    }
}

