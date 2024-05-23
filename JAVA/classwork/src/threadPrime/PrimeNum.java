package threadPrime;

public class PrimeNum implements Runnable{
    @Override
    public void run() {
        System.out.println("Prime numbers from 1 to 100");

        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
