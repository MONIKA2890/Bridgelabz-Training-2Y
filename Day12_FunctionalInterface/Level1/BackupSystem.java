import java.io.Serializable;

class CustomerData implements Serializable {
    String name;
    int accountId;

    CustomerData(String name, int accountId) {
        this.name = name;
        this.accountId = accountId;
    }
}

public class BackupSystem {
    public static void main(String[] args) {
        CustomerData data = new CustomerData("Raj", 101);

        if (data instanceof Serializable) {
            System.out.println("This object is eligible for backup storage.");
        }
    }
}

