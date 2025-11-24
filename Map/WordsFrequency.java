import java.util.*;

public class WordsFrequency {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

      
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        
        String[] words = sentence.split("\\s+");

       
        Map<String, Integer> freq = new HashMap<>();

       
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

     
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

