package bankingsystem;

class BankAccount {
    double balance = 500; // Starting balance
    final double MINIMUM_BALANCE = 100; // Minimum balance constant

    // Withdraw method
    void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
        }
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

