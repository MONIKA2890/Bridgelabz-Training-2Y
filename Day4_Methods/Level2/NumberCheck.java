import java.util.*;

public class NumberCheck {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (isPositive(n)) {
                System.out.print(n + " is Positive and ");
                System.out.println(isEven(n) ? "Even" : "Odd");
            } else {
                System.out.println(n + " is Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and last elements are Equal");
        else if (result > 0) System.out.println("First element is Greater");
        else System.out.println("First element is Smaller");
        sc.close();
    }
}
