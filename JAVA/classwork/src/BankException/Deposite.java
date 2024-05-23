package BankException;

public class Deposite extends Atm{
    public int Deposite(int balance,int amount) {
        int deposite = balance + amount;
        return deposite;
    }
}
