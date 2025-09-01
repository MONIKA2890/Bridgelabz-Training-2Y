
import java.util.Scanner;

public class StringLength {

    // User-defined method
    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // jab index out of bound hoga tab exception aayega
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // return count when exception occurs
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len1 = getLength(str);
        int len2 = str.length();

        System.out.println("Length using user-defined method: " + len1);
        System.out.println("Length using built-in method: " + len2);
    }
}
