// This version does NOT use Singleton (Inefficient)
class BankDatabase {
    public BankDatabase() {
        System.out.println("New Bank Database Connection Created");
    }

    public void checkBalance(String account) {
        System.out.println("Checking balance for: " + account);
    }

    public void withdrawMoney(String account, double amount) {
        System.out.println("Withdrawing $" + amount + " from " + account);
    }
}

public class BeforeBankSystem {
    public static void main(String[] args) {
        // Creating multiple connections (Problem)
        BankDatabase db1 = new BankDatabase();
        db1.checkBalance("User123");

        BankDatabase db2 = new BankDatabase();
        db2.withdrawMoney("User123", 500);
    }
}
