class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber; 
    private double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;  
    }

    void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}


public class BankSystem {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Raj", 1001, 5000);
        BankAccount acc2 = new BankAccount("Simran", 1002, 8000);


        if (acc1 instanceof BankAccount) {
            acc1.displayAccountDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayAccountDetails();
        }

        
        BankAccount.getTotalAccounts();
    }
}
