package threadDemo.threadInterrupt;

import java.util.Date;

public class ThreadInterrupt extends Thread{
    public ThreadInterrupt() {
    }

    public ThreadInterrupt(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("线程开始:" + new Date());

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("线程被中断");;
        }

        System.out.println("线程结束:" + new Date());

    }
}
