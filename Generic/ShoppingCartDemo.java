import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();
    
    void addItem(T item) { items.add(item); }
    void removeItem(T item) { items.remove(item); }
    void displayItems() { System.out.println(items); }
}

class Electronics { String name; Electronics(String name) { this.name = name; } public String toString() { return name; } }
class Clothing { String name; Clothing(String name) { this.name = name; } public String toString() { return name; } }

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.displayItems();
    }
}

