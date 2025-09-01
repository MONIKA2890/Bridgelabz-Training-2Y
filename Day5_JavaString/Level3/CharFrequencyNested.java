
import java.util.*;

public class CharFrequencyNested {
    static void charFrequency(String text) {
        char[] arr = text.toCharArray();
        int n = arr.length;
        int[] freq = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1; // mark visited
                }
            }
            freq[i] = count;
        }
        
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            if (freq[i] != -1) {
                System.out.println(arr[i] + "         | " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        charFrequency(s);
        sc.close();
    }
}
