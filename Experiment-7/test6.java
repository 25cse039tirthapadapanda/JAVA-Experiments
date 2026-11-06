class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalance {
        System.out.println("Attempting to withdraw: Rs. " + amount);
        if (amount > balance) {
            throw new InsufficientBalance("Insufficient Balance! Current balance is Rs. " + balance + ", but requested Rs. " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: Rs. " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class test6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        System.out.println("Initial Account Balance: Rs. " + account.getBalance() + "\n");

        try {
            account.withdraw(2000.0);
            System.out.println();
            account.withdraw(4000.0); // Throws InsufficientBalance
        } catch (InsufficientBalance e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("\nFinal Account Balance: Rs. " + account.getBalance());
        }
    }
}

