public class NullPointerDemo {
    
    // Method to generate NullPointerException
    static void generateException() {
        String str = null; // Null value
        System.out.println(str.length()); // Will throw NullPointerException
    }
    
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}


