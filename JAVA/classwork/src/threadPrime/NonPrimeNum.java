package threadPrime;

public class NonPrimeNum implements Runnable{
    @Override
    public void run() {
        System.out.println("Non Prime Numbers from 1 to 100");
        String nonprimeNumbers = "";

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                nonprimeNumbers += i + " ";
            }
        }
        System.out.println(nonprimeNumbers);
    }

}
