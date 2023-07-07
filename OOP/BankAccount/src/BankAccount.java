public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public static int getAccounts() {
        return accounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public void deposit(String account, double amount) {
        if (account.equals("checking")) {
            this.checkingBalance += amount;
            totalMoney += amount;
        } else if (account.equals("savings")) {
            this.savingsBalance += amount;
            totalMoney += amount;
        } else {
            System.out.println("Invalid account type.");
        }
    }
    public void withdraw(String account, double amount) {
        if (account.equals("checking")) {
            if (this.checkingBalance - amount < 0) {
                System.out.println("Insufficient funds.");
            } else {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            }
        } else if (account.equals("savings")) {
            if (this.savingsBalance - amount < 0) {
                System.out.println("Insufficient funds.");
            } else {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            }
        } else {
            System.out.println("Invalid account type.");
        }
    }
    public void getBalance() {
        System.out.println("Checking balance: " + this.checkingBalance);
        System.out.println("Savings balance: " + this.savingsBalance);
    }
}