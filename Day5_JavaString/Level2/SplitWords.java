import java.util.Scanner;

public class SplitWords{

    // Custom split method
    static String[] splitWords(String str) {
        String word = "";
        int count = 0;

        // Count words
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        String[] words = new String[count + 1];

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] arr1 = splitWords(str);
        String[] arr2 = str.split(" ");

        System.out.println("Using user-defined split:");
        for (String w : arr1) System.out.println(w);

        System.out.println("\nUsing built-in split:");
        for (String w : arr2) System.out.println(w);

        System.out.println("Are both arrays equal? " + compareArrays(arr1, arr2));
    }
}

