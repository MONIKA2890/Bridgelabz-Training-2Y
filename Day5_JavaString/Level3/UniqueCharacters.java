
import java.util.*;

public class UniqueCharacters {
    // length without using String.length()
    static int strLength(String s) {
        int i = 0;
        try {
            for (;; i++) s.charAt(i);
        } catch (IndexOutOfBoundsException e) { }
        return i;
    }

    static char[] uniqueChars(String text) {
        int n = strLength(text);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { seen = true; break; }
            }
            if (!seen) temp[k++] = c;
        }
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        char[] uniq = uniqueChars(s);
        System.out.println("Unique characters (in order): " + new String(uniq));
        sc.close();
    }
}
