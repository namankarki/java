public class BankAccount {
    // Private attributes
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public accessor for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public accessor for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public accessor for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount("123456789", "John Doe", 500.0);

        // Display initial account details
        account.displayAccountDetails();

        // Deposit funds
        account.deposit(200.0);

        // Withdraw funds
        account.withdraw(100.0);

        // Display updated account details
        System.out.println("\nUpdated Account Details:");
        account.displayAccountDetails();
    }
}
