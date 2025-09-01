import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[20]; // store digits
        int index = 0;

        while (num > 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int[] frequency = new int[10]; // 0-9 digits
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
