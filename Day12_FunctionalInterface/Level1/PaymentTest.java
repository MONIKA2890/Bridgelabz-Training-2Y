interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated (default process)");
    }
}

class PayTM implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayTM");
    }
}

class Razorpay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Razorpay");
    }
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed through Razorpay system");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayTM();
        PaymentProcessor p2 = new Razorpay();

        p1.pay(500);
        p1.refund(200);

        p2.pay(1000);
        p2.refund(300);
    }
}

