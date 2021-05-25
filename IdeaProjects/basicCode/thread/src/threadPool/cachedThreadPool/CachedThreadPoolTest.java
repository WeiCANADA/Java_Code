package threadDemo.threadPool.cachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {
    public static void main(String[] args) {
        //创建一个可根据需要创建新线程的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            executorService.submit(new MyRunnable("" + i));
        }
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
