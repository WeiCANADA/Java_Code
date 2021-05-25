package threadDemo.threadPool.fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池:
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //for loop create 6 Threads
        for (int i = 0; i < 6; i++) {
            executorService.submit(new MyRunnable("" + i));
        }
        // 关闭线程池:
        executorService.shutdown();

    }
    static class MyRunnable implements Runnable{
        private  final String name;

        MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("start task " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end task " + name);
        }
    }
}
