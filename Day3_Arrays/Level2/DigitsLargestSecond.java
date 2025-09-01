import java.util.Scanner;

public class DigitsLargestSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[20]; // initially max size
        int index = 0;

        while (num > 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        sc.close();
    }
}

