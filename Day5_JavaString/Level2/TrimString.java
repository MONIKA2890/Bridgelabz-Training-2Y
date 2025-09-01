
public class TrimString {
    // Method to trim leading and trailing spaces
    static String trimSpaces(String str) {
        int start = 0, end = str.length() - 1;

        // Find first non-space
        while (start <= end && str.charAt(start) == ' ') start++;
        // Find last non-space
        while (end >= start && str.charAt(end) == ' ') end--;

        return str.substring(start, end + 1);
    }

    // Method to compare two strings
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "   Hello World   ";
        String str2 = "Hello World";

        System.out.println("Before Trim: [" + str1 + "]");
        String trimmed = trimSpaces(str1);
        System.out.println("After Trim: [" + trimmed + "]");
        System.out.println("Comparison with str2: " + compareStrings(trimmed, str2));
    }
}
