class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private int balance = 10000;

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }
}

public class ATMTest {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(12000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
