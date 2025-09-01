
public class NumberFormatDemo {
    
    // Method to generate NumberFormatException
    static void generateException() {
        String str = "ABC123";
        int num = Integer.parseInt(str); // Will throw NumberFormatException
        System.out.println(num);
    }
    
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
