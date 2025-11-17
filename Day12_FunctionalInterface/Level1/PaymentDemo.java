interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via UPI.");
    }
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Credit Card.");
    }
}
class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Wallet.");
    }
}
public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(500.00);
        p2.pay(1200.50);
        p3.pay(250.75);
    }
}

