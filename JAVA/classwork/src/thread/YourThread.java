package thread;

public class YourThread implements Runnable{
    public void run() {

            System.out.println(Thread.currentThread().getName());
            try {
                 Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
