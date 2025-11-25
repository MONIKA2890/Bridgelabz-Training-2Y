public class GenericCompare {

   
    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }

    public static void main(String[] args) {

        System.out.println(isEqual(10, 10));          // true
        System.out.println(isEqual("Java", "java"));  // false
        System.out.println(isEqual(5.5, 5.5));        // true
        System.out.println(isEqual("Hello", "Hello")); // true
        System.out.println(isEqual(null, null));       // true
        System.out.println(isEqual(null, "Java"));     // false
    }
}

