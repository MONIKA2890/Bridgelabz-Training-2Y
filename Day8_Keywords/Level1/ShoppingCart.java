class Product {
    
    static double discount = 10.0; 

   
    private String productName;
    private double price;
    private int quantity;
    private final String productID; 


    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    
    double getTotalPrice() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }


    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price after Discount: " + getTotalPrice());
        System.out.println("------------------------------");
    }

    
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }
}


public class ShoppingCart {
    public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 50000, 1, "P1001");
        Product p2 = new Product("Headphones", 2000, 2, "P1002");

        
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

        Product.updateDiscount(20);

        
        p1.displayDetails();
        p2.displayDetails();
    }
}

