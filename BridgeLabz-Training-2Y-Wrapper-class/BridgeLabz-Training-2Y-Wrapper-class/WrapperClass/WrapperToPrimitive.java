public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double d = dObj.doubleValue();   // Unboxing
        int i = (int) d;                 // Casting

        System.out.println("Double object: " + dObj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int (after casting): " + i);
    }
}
