package threadDemo.threadSleep;

public class ThreadSleepTest {

    public static void main(String[] args) {
        //创建三个线程
        ThreadSleep threadSleep = new ThreadSleep();
        ThreadSleep threadSleep2 = new ThreadSleep();
        ThreadSleep threadSleep3 = new ThreadSleep();

        //使用setName的方法设置线程名称
        threadSleep.setName("A");
        threadSleep2.setName("B");
        threadSleep3.setName("C");

        //启动线程
        threadSleep.start();
        threadSleep2.start();
        threadSleep3.start();

    }
}
