import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " (₹" + price + ", ⭐" + rating + ", " + discount + "% off)";
    }
}

public class ECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 80000, 4.5, 10),
                new Product("Phone", 60000, 4.7, 15),
                new Product("Watch", 10000, 4.2, 20)
        );

        System.out.println("\nSort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}
