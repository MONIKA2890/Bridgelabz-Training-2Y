
import java.util.*;

public class FirstNonRepeating {
    static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i) & 0xFF]++;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c & 0xFF] == 1) return c;
        }
        return '\0'; // none
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        char ans = firstNonRepeating(s);
        if (ans == '\0') System.out.println("No non-repeating character.");
        else System.out.println("First non-repeating character: " + ans);
        sc.close();
    }
}
