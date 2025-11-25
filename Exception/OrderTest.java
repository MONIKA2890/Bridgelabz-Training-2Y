import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) { super(message); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) { super(message); }
}

class OnlineOrder {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int result = r.nextInt(3); // 0,1,2
        switch(result){
            case 0 -> System.out.println("Order placed successfully!");
            case 1 -> throw new OutOfStockException("Product is out of stock!");
            case 2 -> throw new PaymentFailedException("Payment failed. Try again!");
        }
    }
}

public class OrderTest {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        try {
            order.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}

