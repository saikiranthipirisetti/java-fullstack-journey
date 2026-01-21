class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class AccountNotFoundException extends Exception {
    AccountNotFoundException(String msg) {
        super(msg);
    }
}

class Account {
    int accountNumber;
    String accountHolderName;
    double balance;

    Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds in account " + accountNumber);
        }
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }
}

public class Solution {

    static Account findAccount(Account[] accounts, int accNo)
            throws AccountNotFoundException {

        for (Account acc : accounts) {
            if (acc.accountNumber == accNo) {
                return acc;
            }
        }
        throw new AccountNotFoundException(
                "Target account " + accNo + " does not exist");
    }

    static void transferFunds(Account[] accounts,
                              int sourceAcc,
                              int targetAcc,
                              double amount)
            throws InsufficientFundsException, AccountNotFoundException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount cannot be negative or zero");
        }

        Account source = findAccount(accounts, sourceAcc);
        Account target = findAccount(accounts, targetAcc);

        source.withdraw(amount);
        target.deposit(amount);
    }

    public static void main(String[] args) {

        Account[] accounts = {
                new Account(101, "Rohit", 5000),
                new Account(102, "Anjali", 5000)
        };

        performTransaction(accounts, 101, 102, 6000);
        performTransaction(accounts, 101, 105, 1000);
        performTransaction(accounts, 101, 102, -500);
        performTransaction(accounts, 101, 102, 1000);
    }

    static void performTransaction(Account[] accounts,
                                   int src,
                                   int tgt,
                                   double amt) {

        try {
            System.out.println("Enter source account number: " + src);
            System.out.println("Enter target account number: " + tgt);
            System.out.println("Enter amount to transfer: " + amt);

            transferFunds(accounts, src, tgt, amt);

            System.out.println("Transaction successful!");
            System.out.println("Updated balance of " + src + ": " +
                    findAccount(accounts, src).balance);
            System.out.println("Updated balance of " + tgt + ": " +
                    findAccount(accounts, tgt).balance);

        } catch (InsufficientFundsException |
                 AccountNotFoundException |
                 IllegalArgumentException e) {

            System.out.println("Transaction failed: " + e.getMessage());

        } finally {
            System.out.println("Transaction ended.\n");
        }
    }
}
