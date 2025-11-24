import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

      
        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-1111111111", "Data Structures in Java");
        catalog.put("978-2222222222", "Operating Systems");
        catalog.put("978-3333333333", "Database Management Systems");
        catalog.put("978-4444444444", "Computer Networks");

        System.out.println("Initial Catalog: " + catalog);

     
        String searchISBN = "978-3333333333";
        System.out.println("\nSearching for ISBN: " + searchISBN);

        if (catalog.containsKey(searchISBN)) {
            System.out.println("Book Found: " + catalog.get(searchISBN));
        } else {
            System.out.println("Book Not Found");
        }

      
        System.out.println("\nRemoving ISBN 978-1111111111...");
        catalog.remove("978-1111111111");

       
        System.out.println("\nCatalog Sorted by ISBN:");
        Map<String, String> sortedCatalog = new TreeMap<>(catalog);

        for (Map.Entry<String, String> entry : sortedCatalog.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

       
        String titleSearch = "Operating Systems";
        System.out.println("\nSearching for title: " + titleSearch);

        boolean found = false;

        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(titleSearch)) {
                System.out.println("Found! ISBN: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found by title.");
        }
    }
}

