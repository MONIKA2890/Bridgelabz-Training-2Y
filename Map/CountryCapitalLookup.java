import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {

       
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington D.C.");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("France", "Paris");
        countryMap.put("Germany", "Berlin");
        countryMap.put("China", "Beijing");
        countryMap.put("Brazil", "Brasilia");
        countryMap.put("Australia", "Canberra");

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a country name to find its capital: ");
        String input = sc.nextLine();

        if (countryMap.containsKey(input)) {
            System.out.println("Capital of " + input + " is: " + countryMap.get(input));
        } else {
            System.out.println("Unknown country");
        }

      
        System.out.println("\n=== All Country–Capital Pairs (Alphabetical) ===");

       
        List<String> countryList = new ArrayList<>(countryMap.keySet());
        Collections.sort(countryList);

        for (String country : countryList) {
            System.out.println(country + " → " + countryMap.get(country));
        }

        sc.close();
    }
}

