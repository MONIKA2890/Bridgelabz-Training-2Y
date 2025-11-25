class Util {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Util.isEqual(10, 10));
        System.out.println(Util.isEqual("A", "B"));
    }
}

