public class StringIndexOutOfBoundsDemo {
    
    // Method to generate StringIndexOutOfBoundsException
    static void generateException() {
        String str = "Hello";
        System.out.println(str.charAt(10)); // Index beyond length
    }
    
    public static void main(String[] args) {
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

