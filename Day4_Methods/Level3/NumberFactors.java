public class NumberFactors {
    // Method to find and print factors of a number
    public static void printFactors(int number) {
        System.out.print("Factors of " + number + ": ");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
    }
    
    // Method to count factors of a number
    public static int countFactors(int number) {
        int count = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int testNumber = 28;
        
        printFactors(testNumber);
        System.out.println("Number of factors: " + countFactors(testNumber));
    }
}