package Assignment8;

public class FactorialCalculator {
    private int num;

    public FactorialCalculator(int num) {
        this.num = num;
    }

    public int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
