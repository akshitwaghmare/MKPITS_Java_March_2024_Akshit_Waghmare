package threadPrimeInnerClass;

import threadPrime.NonPrimeNum;
import threadPrime.PrimeNum;

public class Prime implements Runnable {

    @Override
    public void run() {
        class PrimeNum implements Runnable {
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

        class NonPrimeNum implements Runnable {
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

    }
    public void execute(){
        PrimeNum primeNum = new PrimeNum();
        NonPrimeNum nonPrimeNum = new NonPrimeNum();

        Thread thread = new Thread(primeNum);
        Thread thread1 = new Thread(nonPrimeNum);

        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();

    }
}