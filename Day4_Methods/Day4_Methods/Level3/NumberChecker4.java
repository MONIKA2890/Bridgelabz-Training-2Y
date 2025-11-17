public class NumberChecker4 {
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
    
    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        return sum == number;
    }
    
    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        
        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /= 10;
        }
        
        return true;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int testNumber1 = 17;  // Prime
        int testNumber2 = 9;   // Neon
        int testNumber3 = 5;   // Automorphic
        
        System.out.println("Number: " + testNumber1);
        System.out.println("Is prime: " + isPrime(testNumber1));
        
        System.out.println("Number: " + testNumber2);
        System.out.println("Is neon: " + isNeon(testNumber2));
        
        System.out.println("Number: " + testNumber3);
        System.out.println("Is automorphic: " + isAutomorphic(testNumber3));
    }
}