import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] table = new int[4]; // 6,7,8,9

        for (int i = 6; i <= 9; i++) {
            table[i - 6] = num * i;
            System.out.println(num + " * " + i + " = " + table[i - 6]);
        }
        sc.close();
    }
}

