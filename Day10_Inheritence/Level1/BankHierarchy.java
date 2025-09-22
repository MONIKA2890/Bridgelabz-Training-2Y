
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int tenure; // in months

    FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Tenure: " + tenure + " months");
    }
}

// Main
public class BankHierarchy {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount(103, 20000, 24);

        sa.displayAccountType();
        System.out.println("-------------------");
        ca.displayAccountType();
    }
}