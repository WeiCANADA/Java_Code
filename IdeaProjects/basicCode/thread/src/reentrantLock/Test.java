package threadDemo.reentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        //创建Counter对象
        Counter counter = new Counter();

        //进程对象
        AddTread addTread = new AddTread(counter);
        DecThread decThread = new DecThread(counter);
        GetThread getThread = new GetThread(counter);


        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //执行
        executorService.submit(addTread);
        executorService.submit(decThread);
        executorService.submit(getThread);

        executorService.shutdown();

    }
}
