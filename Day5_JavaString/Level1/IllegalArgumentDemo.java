public class IllegalArgumentDemo {
    
    // Method to generate IllegalArgumentException
    static void generateException() {
        String str = "CodinClub";
        // start index greater than end index → IllegalArgumentException
        String sub = str.substring(5, 2); 
        System.out.println(sub);
    }
    
    public static void main(String[] args) {
        try {
            generateException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

