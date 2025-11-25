
class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}


class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}


class MarketplaceUtils {

    
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.price = discountedPrice;
    }
}


public class MarketplaceDemo {
    public static void main(String[] args) {
       
        Product<BookCategory> book = new Product<>("Java Programming Book", 50.0, new BookCategory());
        Product<ClothingCategory> tshirt = new Product<>("T-Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 500.0, new GadgetCategory());

       
        MarketplaceUtils.applyDiscount(book, 10);       // 10% discount
        MarketplaceUtils.applyDiscount(tshirt, 25);     // 25% discount
        MarketplaceUtils.applyDiscount(smartphone, 5);  // 5% discount

      
        System.out.println("Products after discount:");
        System.out.println(book);
        System.out.println(tshirt);
        System.out.println(smartphone);
    }
}

