class AccountNotFoundException extends Exception { AccountNotFoundException(String msg){ super(msg); } }
class InsufficientFundsException extends Exception { InsufficientFundsException(String msg){ super(msg); } }

class BankTransaction {
    public void verifyAccount(String account) throws AccountNotFoundException {
        if(!account.equals("A123")) throw new AccountNotFoundException("Account not found!");
    }

    public void processTransaction(int amount) throws InsufficientFundsException {
        if(amount > 5000) throw new InsufficientFundsException("Insufficient funds for transaction!");
    }

    public void executeTransaction(String account, int amount) throws Exception {
        verifyAccount(account);
        processTransaction(amount);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankTransaction bt = new BankTransaction();
        try {
            bt.executeTransaction("B999", 6000);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}

