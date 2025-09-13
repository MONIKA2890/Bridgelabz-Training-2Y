import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(itemName + " - " + quantity + " x " + price + " = " + getTotalCost());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayCart() {
        double total = 0;
        System.out.println("Shopping Cart:");
        for (CartItem item : items) {
            item.display();
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Laptop", 60000, 1));
        cart.addItem(new CartItem("Mouse", 1500, 2));

        cart.displayCart();

        cart.removeItem("Mouse");
        cart.displayCart();
    }
}
