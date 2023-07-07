public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        System.out.println(BankAccount.getAccounts());
        account1.deposit("checking", 100);
        account1.deposit("savings", 100);
        account1.getBalance();
        account2.deposit("checking", 100);
        account2.deposit("savings", 100);
        account2.getBalance();
        account1.withdraw("checking", 50);
        account1.withdraw("savings", 50);
        account1.getBalance();
        account2.withdraw("checking", 50);
        account2.withdraw("savings", 50);
        account2.getBalance();
        System.out.println(BankAccount.getTotalMoney());
    }
}
