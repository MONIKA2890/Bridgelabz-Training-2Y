import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg){ super(msg); }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg){ super(msg); }
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg){ super(msg); }
}

class Transaction {
    public void process() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        Random r = new Random();
        int n = r.nextInt(3);
        switch(n){
            case 0 -> throw new NegativeAmountException("Transaction failed: Negative amount");
            case 1 -> throw new InsufficientFundsException("Transaction failed: Insufficient balance");
            case 2 -> throw new NetworkFailureException("Transaction failed: Network error");
        }
    }
}

public class BankingTest {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.process();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

