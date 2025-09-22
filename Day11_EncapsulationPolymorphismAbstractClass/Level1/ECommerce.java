
import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId; this.name = name; this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount(); 

    public void getProductDetails() {
        System.out.println(productId + " - " + name + " : " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.10; } // 10% off
    @Override public double calculateTax() { return getPrice() * 0.18; } // 18% GST
    @Override public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.20; } // seasonal
    @Override public double calculateTax() { return getPrice() * 0.05; } // 5%
    @Override public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return 0; } // no discount
}

public class ECommerce {
    public static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0.0;
        double finalPrice = price + tax - discount;
        p.getProductDetails();
        System.out.printf("Tax: %.2f, Discount: %.2f, Final: %.2f\n\n", tax, discount, finalPrice);
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Electronics("E100","Smartphone",30000),
            new Clothing("C200","Jeans",2000),
            new Groceries("G300","Rice(5kg)",2500)
        );
        for (Product p : products) printFinalPrice(p);
    }
}

