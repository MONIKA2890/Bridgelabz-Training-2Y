class ProductPrototype implements Cloneable {
    int productId;
    String productName;

    ProductPrototype(int id, String name) {
        this.productId = id;
        this.productName = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws Exception {
        ProductPrototype p1 = new ProductPrototype(101, "Laptop");
        ProductPrototype p2 = (ProductPrototype) p1.clone();

        System.out.println("Original: " + p1.productId + ", " + p1.productName);
        System.out.println("Clone: " + p2.productId + ", " + p2.productName);
    }
}
