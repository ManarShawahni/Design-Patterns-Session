public class AfterBankSystem {
    public static void main(String[] args) {
        BankDatabase db1 = BankDatabase.getInstance();
        db1.checkBalance("User123");

        BankDatabase db2 = BankDatabase.getInstance();
        db2.withdrawMoney("User123", 500);
    }
}
