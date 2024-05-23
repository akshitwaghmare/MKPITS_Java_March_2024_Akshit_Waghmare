package BankException;

public class Withdrawl extends Atm {

    public static int Withdrawl(int balance,int amount) {

        int withdrawl = balance - amount;
        return withdrawl;
    }
}
