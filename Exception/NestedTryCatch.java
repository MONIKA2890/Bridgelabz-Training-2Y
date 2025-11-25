public class NestedTryCatch {
    public static void methodB() {
        try {
            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch(NumberFormatException e) {
            System.out.println("Handled in methodB: " + e.getMessage());
        }
        // NullPointerException will propagate
        String s = null;
        System.out.println(s.length());
    }

    public static void methodA() {
        try {
            methodB();
        } catch(NullPointerException e) {
            System.out.println("Caught in methodA: " + e);
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}

