package threadsleepwait;


import thread.YourThread;

public class Main {
    public static void main(String[] args) {
        UsThread usThread = new UsThread();
        usThread.start();
        synchronized (usThread) {
            try {
                usThread.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Sum : " + usThread.sum);
        }
    }
}
