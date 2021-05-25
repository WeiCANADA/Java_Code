package threadDemo.reentrantLock;

public class GetThread implements Runnable{
    private Counter counter;
    public GetThread (Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        System.out.println(counter.getCount());
    }
}
