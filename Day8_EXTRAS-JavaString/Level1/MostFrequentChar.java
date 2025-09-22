
import java.util.HashMap;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (char c : map.keySet()) {
            if (map.get(c) > maxCount) {
                maxChar = c;
                maxCount = map.get(c);
            }
        }

        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}
