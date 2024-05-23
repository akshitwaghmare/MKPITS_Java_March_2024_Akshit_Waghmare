package pc;

public class Producer extends Thread{

    Company company;
    Producer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        int i=1;
        while(true){
            company.produceitem(i);
           i++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
