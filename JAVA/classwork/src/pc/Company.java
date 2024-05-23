package pc;

public class Company {
    int n;
    boolean f=false;

    public synchronized void produceitem(int n){

        if(f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("produced: "+n);
        f=true;
        notify();
    }
    public synchronized void consumeitem(){
        if(!f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("consumed: "+n);
        f=false;
        notify();
    }
}
