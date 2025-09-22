import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word/number: ");
        String input = sc.next();

        if (isPalindrome(input))
            System.out.println(input + " is a Palindrome.");
        else
            System.out.println(input + " is NOT a Palindrome.");

        sc.close();
    }
}

