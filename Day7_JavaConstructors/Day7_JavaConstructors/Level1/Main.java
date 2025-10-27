class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

   
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}


public class Ac {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Alice";
        pg.setCGPA(3.8);
        pg.displayStudentInfo();

        EBook ebook = new EBook();
        ebook.ISBN = "978-1234567890";
        ebook.title = "Java Programming";
        ebook.setAuthor("John Doe");
        ebook.displayBookInfo();

        BankAccount acc = new BankAccount();
        acc.accountNumber = "AC123456";
        acc.deposit(1000);
        acc.withdraw(200);
        System.out.println("Balance: $" + acc.getBalance());
    }
}

