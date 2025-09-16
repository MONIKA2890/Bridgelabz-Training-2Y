public class NumberChecker2 {
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
    
    // Method to find sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative numbers
        
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int testNumber = 12345;
        
        System.out.println("Number: " + testNumber);
        System.out.println("Digit count: " + countDigits(testNumber));
        
        int[] digits = storeDigits(testNumber);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("Sum of digits: " + sumOfDigits(testNumber));
    }
}