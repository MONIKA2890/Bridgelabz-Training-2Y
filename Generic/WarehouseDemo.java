import java.util.*;

// Base abstract class for all warehouse items
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

// Subclasses for specific item types
class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

// Generic Storage class for any WarehouseItem
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Add item to storage
    void addItem(T item) {
        items.add(item);
    }

    // Get all items from storage
    List<T> getItems() {
        return items;
    }
}

// Utility class to display items using wildcard
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

// Demonstration
public class WarehouseDemo {
    public static void main(String[] args) {
        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        // Furniture storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Groceries storage
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        // Display items using wildcard method
        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());
    }
}

