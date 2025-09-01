import java.util.*;

public class PalindromeCheck {
    // Logic 1: Iterative check
    static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Logic 2: Recursive check
    static boolean isPalindromeRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRecursive(s, i + 1, j - 1);
    }

    // Logic 3: Reverse string and compare
    static boolean isPalindromeReverse(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return Arrays.equals(arr, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        System.out.println("Iterative check: " + isPalindromeIterative(s));
        System.out.println("Recursive check: " + isPalindromeRecursive(s, 0, s.length() - 1));
        System.out.println("Reverse compare check: " + isPalindromeReverse(s));
        sc.close();
    }
}

