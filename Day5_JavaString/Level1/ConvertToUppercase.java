import java.util.Scanner;

public class ConvertToUppercase {
    
    // Method to convert to uppercase using charAt()
    static String toUpperCaseManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  
                result += (char)(ch - 32); // ASCII difference
            } else {
                result += ch;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // User-defined conversion
        String manual = toUpperCaseManual(str);
        System.out.println("Converted using manual method: " + manual);
        
        // Built-in method
        String builtin = str.toUpperCase();
        System.out.println("Converted using built-in method: " + builtin);
        
        // Compare
        System.out.println("Are both results equal? " + manual.equals(builtin));
        
        sc.close();
    }
}

