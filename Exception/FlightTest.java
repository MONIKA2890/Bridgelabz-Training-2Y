class SeatUnavailableException extends Exception { SeatUnavailableException(String msg){ super(msg); } }
class PaymentFailedException extends Exception { PaymentFailedException(String msg){ super(msg); } }

class FlightBooking {
    public void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("No seats available!");
    }

    public void processPayment() throws PaymentFailedException {
        throw new PaymentFailedException("Payment failed!");
    }

    public void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
    }
}

public class FlightTest {
    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking();
        try {
            fb.bookTicket();
        } catch(SeatUnavailableException e) {
            System.out.println(e.getMessage());
        } catch(PaymentFailedException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Other exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}

