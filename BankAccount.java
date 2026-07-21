public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    // Constructor 1
    public BankAccount(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    // Constructor 2 (overloaded)
    public BankAccount(String accountNumber, String accountHolderName,
                        String accountType, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Quick test
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("101", "Alice", "Savings");
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayAccountInfo();

        BankAccount acc2 = new BankAccount("102", "Bob", "Current", 1000);
        acc2.withdraw(1500); // insufficient balance test
        acc2.displayAccountInfo();
    }
}