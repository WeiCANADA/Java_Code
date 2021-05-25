package threadDemo.threadInterrupt;

public class ThreadInterruptTest {
    public static void main(String[] args) {
        ThreadInterrupt threadInterrupt = new ThreadInterrupt();
        threadInterrupt.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadInterrupt.interrupt();
    }
}
