package threadDemo.threadGroup;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getThreadGroup().getName() + "\t"
                    + Thread.currentThread().getName() + ":" + i);
        }
    }
}
