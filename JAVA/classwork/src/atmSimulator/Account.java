package atmSimulator;

public class Account {

    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

        public int checkBalance() {
            System.out.println("Your current balance is: " + balance);
            return balance;
        }
}
