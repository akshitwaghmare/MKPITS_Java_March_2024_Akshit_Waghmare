package acc;

public class Account {
    private String accno;
    private String name;
    private int balance;

    // Default constructor
    public Account() {
        accno = "AKSHIT2001";
        name = "Akshit";
        balance = 1000;
    }

    // Parameterized constructor
    public Account(String accno, String name, int balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    // Getters and setters (not explicitly mentioned, but assumed to be included)
    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void printAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccno());
        System.out.println("Name: " + account.getName());
        System.out.println("Balance: " + account.getBalance());
    }
}
