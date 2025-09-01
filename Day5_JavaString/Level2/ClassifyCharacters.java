import java.util.Scanner;

public class ClassifyCharacters {

    static String classify(char ch) {
        if (!Character.isLetter(ch)) return "Not Letter";
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + "\t" + classify(ch));
        }
    }
}

