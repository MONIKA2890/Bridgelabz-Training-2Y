import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to countdown: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
