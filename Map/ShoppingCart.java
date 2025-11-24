import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

       
        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Headphones", 1500.0);

       
        System.out.println("Items in Cart:");
        for (String p : cart.keySet()) {
            System.out.println(p + " → " + cart.get(p));
        }

       
        double total = 0;
        for (double price : cart.values()) total += price;

        System.out.println("\nTotal Before Discount: ₹" + total);

       
        if (total > 5000) {
            total *= 0.90;
            System.out.println("10% Discount Applied!");
        }

        System.out.println("Final Amount: ₹" + total);

       
        cart.remove("Mouse");
        System.out.println("\nCart After Removing Mouse:");
        for (String p : cart.keySet()) {
            System.out.println(p + " → " + cart.get(p));
        }
    }
}

