
public class ArrayIndexOutOfBoundsDemo {
    
    // Method to generate ArrayIndexOutOfBoundsException
    static void generateException() {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[10]); // Index larger than length
    }
    
    public static void main(String[] args) {
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
