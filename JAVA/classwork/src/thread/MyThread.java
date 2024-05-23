package thread;

import static java.lang.Thread.sleep;

public class MyThread extends Thread{

    public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
