import java.util.*;

public class CharFrequency {
    static int[] freqTable(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i) & 0xFF]++;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        int[] f = freqTable(s);
        System.out.println("Char  ASCII  Freq");
        System.out.println("------------------");
        for (int i = 0; i < 256; i++) {
            if (f[i] > 0) {
                char c = (char)i;
                String disp = (Character.isISOControl(c)) ? ("\\u" + String.format("%04x", i)) : Character.toString(c);
                System.out.printf("%-5s %-6d %d%n", disp, i, f[i]);
            }
        }
        sc.close();
    }
}

