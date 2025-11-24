import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visitMap = new HashMap<>();

      
        String[] visits = {
            "home", "about", "products", "home", 
            "products", "contact", "home", 
            "home", "about", "products"
        };

      
        for (String page : visits) {
            visitMap.put(page, visitMap.getOrDefault(page, 0) + 1);
        }

       
        System.out.println("Page Visit Counts:");
        for (String page : visitMap.keySet()) {
            System.out.println(page + " → " + visitMap.get(page));
        }

       
        System.out.println("\nPages Sorted by Visit Count (Descending):");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(visitMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

      
        String mostVisited = Collections.max(visitMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("\nMost Visited Page: " + mostVisited);
    }
}

