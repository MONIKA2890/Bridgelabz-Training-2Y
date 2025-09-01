import java.util.*;

public class UniqueAndFrequencies {
    static char[] uniqueChars(String s) {
        boolean[] seen = new boolean[256];
        char[] temp = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c & 0xFF]) {
                seen[c & 0xFF] = true;
                temp[k++] = c;
            }
        }
        return Arrays.copyOf(temp, k);
    }

    static int[] frequencies(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i) & 0xFF]++;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        char[] uniq = uniqueChars(s);
        int[] freq = frequencies(s);

        System.out.println("Unique Character  Frequency");
        System.out.println("---------------------------");
        for (char c : uniq) {
            int ascii = c & 0xFF;
            String disp = (Character.isISOControl(c)) ? ("\\u" + String.format("%04x", ascii)) : Character.toString(c);
            System.out.printf("%-16s %d%n", disp, freq[ascii]);
        }
        sc.close();
    }
}

