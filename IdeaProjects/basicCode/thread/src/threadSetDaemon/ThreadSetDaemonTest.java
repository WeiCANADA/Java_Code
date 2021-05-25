package threadDemo.threadSetDaemon;

public class ThreadSetDaemonTest {
    public static void main(String[] args) {
        ThreadSetDaemon threadSetDaemon1 = new ThreadSetDaemon("张飞");
        ThreadSetDaemon threadSetDaemon2 = new ThreadSetDaemon("关羽");

        //public final void setDaemon(boolean on)
        threadSetDaemon1.setDaemon(true);
        threadSetDaemon2.setDaemon(true);
        threadSetDaemon1.start();
        threadSetDaemon2.start();

        Thread.currentThread().setName("刘备");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i );
        }

    }
}
