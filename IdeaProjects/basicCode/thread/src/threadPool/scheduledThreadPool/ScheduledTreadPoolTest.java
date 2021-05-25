package threadDemo.threadPool.scheduledThreadPool;

import threadDemo.threadGroup.MyRunnable;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
* 还有一种任务，需要定期反复执行，例如，每秒刷新证券价格。这种任务本身固定，需要反复执行的，
* 可以使用ScheduledThreadPool。放入ScheduledThreadPool的任务可以定期反复执行。
* */
public class ScheduledTreadPoolTest {
    public static void main(String[] args) {
      //  创建一个ScheduledThreadPool仍然是通过Executors类：
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);


        for (int i = 0; i < 9; i++) {
            //我们可以提交一次性任务，它会在指定延迟后只执行一次：
            //schedule(Runnable command, long delay, TimeUnit unit)
            //scheduledThreadPoolExecutor.schedule(new MyRunnable("one-time") , 5 , TimeUnit.SECONDS);

            //如果任务以固定的延时2秒 每3秒执行：
            // scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)
            //scheduledThreadPoolExecutor.scheduleAtFixedRate(new MyRunnable("" + i),
             //       2, 3, TimeUnit.SECONDS);

            //scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)
            // 创建并执行一个在给定初始延迟后首次启用的定期操作，随后，在每一次执行终止和下一次执行开始之间都存在给定的延迟。
            scheduledThreadPoolExecutor.scheduleWithFixedDelay(new MyRunnable("" + i),
                    2, 3, TimeUnit.SECONDS);

        }
        //scheduledThreadPoolExecutor.shutdown();
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
