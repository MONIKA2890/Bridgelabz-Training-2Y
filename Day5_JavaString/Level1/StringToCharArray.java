
import java.util.Scanner;

public class StringToCharArray {
    
    // Method to convert string to char array using charAt()
    static char[] convertToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    
    // Method to compare two arrays
    static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        // User-defined method
        char[] arr1 = convertToCharArray(str);
        
        // Built-in method
        char[] arr2 = str.toCharArray();
        
        // Print arrays
        System.out.println("Using user-defined method: " + new String(arr1));
        System.out.println("Using built-in method: " + new String(arr2));
        
        // Compare
        System.out.println("Are both arrays equal? " + compareArrays(arr1, arr2));
        
        sc.close();
    }
}
