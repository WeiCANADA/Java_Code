package threadDemo.threadSleep;

import java.util.Date;

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i + new Date());

            //休眠
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
