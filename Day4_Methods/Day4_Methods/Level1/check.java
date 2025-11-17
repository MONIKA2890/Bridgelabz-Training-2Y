import java.util.Scanner;
public class check { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = checkNumber(num);
        if (result == 1) {
            System.out.println(num + " is a positive number.");
        } else if (result == -1) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }

    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0; // Zero
        }
    }
}

    