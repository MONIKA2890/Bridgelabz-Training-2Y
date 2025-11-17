public class NumberChecker {
    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number); // Handle negative numbers
        
        if (number == 0) {
            return 1;
        }
        
        while (number > 0) {
            number /= 10;
            count++;
        }
        
        return count;
    }
    
    // Method to store digits of a number in an array
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        number = Math.abs(number); // Handle negative numbers
        
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }
    
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = countDigits(number);
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int testNumber = 153;
        
        System.out.println("Number: " + testNumber);
        System.out.println("Digit count: " + countDigits(testNumber));
        
        int[] digits = storeDigits(testNumber);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("Is Armstrong: " + isArmstrong(testNumber));
    }
}