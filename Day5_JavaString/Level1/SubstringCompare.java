import java.util.Scanner;
public class SubstringCompare {
    static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        String sub1 = createSubstring(str, start, end);
        System.out.println("Substring using charAt(): " + sub1);
        String sub2 = str.substring(start, end);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are both substrings equal? " + sub1.equals(sub2));
        
        sc.close();
    }
}

