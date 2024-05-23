package pc;

public class Consumer extends Thread{
    Company company;

    Consumer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        while(true){
            company.consumeitem();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
