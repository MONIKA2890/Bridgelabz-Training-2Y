import java.util.Scanner;

public class PosNegEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                System.out.print(arr[i] + " is Positive, ");
                if (arr[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        if (arr[0] == arr[arr.length - 1])
            System.out.println("First and last elements are equal.");
        else
            System.out.println("First and last elements are NOT equal.");

        sc.close();
    }
}

