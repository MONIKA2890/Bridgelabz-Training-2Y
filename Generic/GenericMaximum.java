public class GenericMaximum {

    
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;  

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10, 25, 15 = " + maximum(10, 25, 15));
        System.out.println("Max of 3.5, 9.2, 6.8 = " + maximum(3.5, 9.2, 6.8));
        System.out.println("Max of 'apple', 'mango', 'banana' = " + maximum("apple", "mango", "banana"));
    }
}


