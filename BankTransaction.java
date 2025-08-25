// With Constructor
class BankAccountTransaction {
    String accountHolder;
    double balance;
    String[] history;
    int index;

    BankAccountTransaction(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.history = new String[10];
        this.index = 0;
    }

    void deposit(double amount) {
        balance += amount;
        history[index++] = "Deposited " + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            history[index++] = "Withdrew " + amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void showHistory() {
        System.out.println("Transaction History of " + accountHolder);
        for (int i = 0; i < index; i++) {
            System.out.println(history[i]);
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccountTransaction acc = new BankAccountTransaction("Sakib", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(2000);
        acc.showHistory();
    }
}

