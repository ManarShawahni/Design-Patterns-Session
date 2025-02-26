// Singleton version to optimize database connections
class BankDatabase {
    private static BankDatabase instance; //Save our reference of object

    // Private constructor to prevent multiple instances
    private BankDatabase() {
        System.out.println("Singleton Bank Database Connection Created");
    }

    // Public method to provide single instance (Thread-Safe)
    public static BankDatabase getInstance() {
        if (instance == null) {
            instance = new BankDatabase();
        }
        return instance;
    }

    public void checkBalance(String account) {
        System.out.println("Checking balance for: " + account);
    }

    public void withdrawMoney(String account, double amount) {
        System.out.println("Withdrawing $" + amount + " from " + account);
    }
}
