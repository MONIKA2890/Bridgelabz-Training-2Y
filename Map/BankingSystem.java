import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        HashMap<String, Double> bank = new HashMap<>();

        
        bank.put("ACC101", 15000.0);
        bank.put("ACC102", 22000.0);
        bank.put("ACC103", 18000.0);
        bank.put("ACC104", 9000.0);
        bank.put("ACC105", 30000.0);

       
        deposit(bank, "ACC104", 5000);
        withdraw(bank, "ACC101", 2000);
        withdraw(bank, "ACC102", 50000); 

       
        List<Map.Entry<String, Double>> list = new ArrayList<>(bank.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\nCustomers Sorted by Balance:");
        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

       
        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " → " + list.get(i).getValue());
        }
    }

    public static void deposit(HashMap<String, Double> bank, String acc, double amt) {
        bank.put(acc, bank.getOrDefault(acc, 0.0) + amt);
    }

    public static void withdraw(HashMap<String, Double> bank, String acc, double amt) {
        if (!bank.containsKey(acc)) return;

        if (amt > bank.get(acc))
            System.out.println("Withdrawal failed for " + acc + " → Insufficient balance");
        else
            bank.put(acc, bank.get(acc) - amt);
    }
}

