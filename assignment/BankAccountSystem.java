package bridgeLabz.assignment;
class BankAccount {
    static String bankName = "OpenAI Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber; // final variable (cannot be reassigned)
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable initialized here
        this.balance = balance;
        totalAccounts++; // Increase total account count
    }
    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("----- Account Details -----");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000);
        BankAccount acc2 = new BankAccount("Bob", 1002, 3000);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc1.deposit(1500);
        acc2.withdraw(1000);
        BankAccount.getTotalAccounts();
    }
}