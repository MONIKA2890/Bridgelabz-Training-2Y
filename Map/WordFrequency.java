import java.util.*;
import java.io.*;

public class WordFrequency {
    public static void main(String[] args) throws Exception {
        String text = "Hello world, hello Java!";

        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println(freq);
    }
}
