class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker("madam");
        PalindromeChecker pc2 = new PalindromeChecker("hello");

        pc1.displayResult();
        pc2.displayResult();
    }
}
