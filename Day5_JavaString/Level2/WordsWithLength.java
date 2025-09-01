
import java.util.Scanner;

public class WordsWithLength {

    static String[][] splitWithLengths(String str) {
        String[] words = str.split(" ");
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[][] arr = splitWithLengths(str);

        System.out.println("Word\tLength");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
