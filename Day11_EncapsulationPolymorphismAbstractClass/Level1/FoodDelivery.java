
import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName; this.price = price; this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int q) { this.quantity = q; }

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity + " @ " + price);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount(); // returns discount amount
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name,price,qty); }
    @Override public double calculateTotalPrice() { return getPrice()*getQuantity(); }
    @Override public double applyDiscount() { return 0.05 * calculateTotalPrice(); } // 5%
    @Override public String getDiscountDetails() { return "5% Veg discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name,price,qty); }
    @Override public double calculateTotalPrice() { return (getPrice()+20) * getQuantity(); } // added non-veg charge
    @Override public double applyDiscount() { return 0.0; }
    @Override public String getDiscountDetails() { return "No discount"; }
}

public class FoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = Arrays.asList(
            new VegItem("Paneer Butter Masala",200,2),
            new NonVegItem("Chicken Biryani",250,1)
        );
        double total = 0;
        for (FoodItem f : order) {
            f.getItemDetails();
            double price = f.calculateTotalPrice();
            double discount = (f instanceof Discountable) ? ((Discountable)f).applyDiscount() : 0;
            System.out.printf("Price: %.2f, Discount: %.2f, Payable: %.2f\n\n", price, discount, price - discount);
            total += (price - discount);
        }
        System.out.println("Order Total: " + total);
    }
}

