package threadDemo.reentrantLock;

public class AddTread implements Runnable{
    private Counter counter;

    public AddTread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.add(10);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
