package threadsleepwait;

public class UsThread  extends Thread{
    int sum = 0;

    @Override
    public synchronized void run() {
            for (int i = 0; i < 50; i++) {
                sum += i;
            }
            notify(); // Notify waiting threads that the calculation is done
    }
}

