public class NumberChecker3{
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        number = Math.abs(number); // Handle negative numbers
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        if (number == 2) {
            return true;
        }
        
        if (number % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int testNumber1 = 12321;
        int testNumber2 = 17;
        
        System.out.println("Number: " + testNumber1);
        System.out.println("Is palindrome: " + isPalindrome(testNumber1));
        
        System.out.println("Number: " + testNumber2);
        System.out.println("Is prime: " + isPrime(testNumber2));
    }
}