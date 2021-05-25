package threadDemo.reentrantLock;

public class DecThread implements Runnable{
    private Counter counter;
    public DecThread (Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.dec(1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
