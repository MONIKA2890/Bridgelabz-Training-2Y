
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber; this.holderName = holderName; this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { if (amount>0) balance += amount; }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; return true; }
        return false;
    }

    public abstract double calculateInterest();

    public void display() {
        System.out.println(accountNumber + " - " + holderName + " Balance: " + balance);
    }
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) { super(acc,name,bal); }
    @Override public double calculateInterest() { return getBalance() * 0.04; } // 4%
    @Override public boolean applyForLoan(double amount) { return calculateLoanEligibility() >= amount; }
    @Override public double calculateLoanEligibility() { return getBalance() * 5; } // simple rule
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double bal) { super(acc,name,bal); }
    @Override public double calculateInterest() { return 0; } // no interest
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
            new SavingsAccount("SAV001","Meera",100000),
            new CurrentAccount("CUR101","Vikram",50000)
        );
        for (BankAccount a : accounts) {
            a.display();
            System.out.println("Interest: " + a.calculateInterest());
            if (a instanceof Loanable) {
                Loanable l = (Loanable)a;
                System.out.println("Loan eligibility: " + l.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}

