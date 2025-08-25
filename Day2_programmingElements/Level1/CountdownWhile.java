import java.util.Scanner;
public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to countdown: ");
        int num = sc.nextInt();

        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        sc.close();
    }
}
