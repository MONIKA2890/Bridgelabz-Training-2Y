import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {

      
        Map<String, Integer> inventory = new HashMap<>();

       
        inventory.put("Laptop", 10);
        inventory.put("Mobile", 25);
        inventory.put("Headphones", 5);
        inventory.put("Keyboard", 12);

        System.out.println("Initial Inventory: " + inventory);

        
        System.out.println("\nCustomer buys 6 Headphones...");
        reduceStock(inventory, "Headphones", 6);

        System.out.println("Customer buys 2 Laptops...");
        reduceStock(inventory, "Laptop", 2);

        
        System.out.println("\nNew shipment: +15 Keyboards");
        inventory.put("Keyboard", inventory.get("Keyboard") + 15);

        
        System.out.println("\nQuery: How many Mobiles left?");
        queryStock(inventory, "Mobile");

        System.out.println("Query: How many Tablets left?");
        queryStock(inventory, "Tablet");

        System.out.println("\nOut of Stock Products:");
        for (String product : inventory.keySet()) {
            if (inventory.get(product) == 0)
                System.out.println(product);
        }

        System.out.println("\nFinal Inventory: " + inventory);
    }


    
    public static void reduceStock(Map<String, Integer> inventory, String product, int qty) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " not found in inventory!");
            return;
        }

        int current = inventory.get(product);
        int updated = current - qty;

        if (updated <= 0) {
            System.out.println(product + " is now OUT OF STOCK!");
            inventory.put(product, 0);  
        } else {
            inventory.put(product, updated);
        }
    }


    public static void queryStock(Map<String, Integer> inventory, String product) {
        if (inventory.containsKey(product)) {
            System.out.println(product + " = " + inventory.get(product) + " units");
        } else {
            System.out.println(product + " is NOT stocked.");
        }
    }
}

