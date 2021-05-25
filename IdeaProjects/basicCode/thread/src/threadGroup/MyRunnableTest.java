package threadDemo.threadGroup;

/*
 * 线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 */

public class MyRunnableTest {
    public static void main(String[] args) {
        //some methods in class ThreadGroup
        method1();

        // 我们如何修改线程所在的组呢?
        // 创建一个线程组
        // 创建其他线程的时候，把其他线程的组指定为我们自己新建线程组
        method2();

    }

    private static void method2() {
        //创建线程组
        //ThreadGroup(String name)
        ThreadGroup my_threadGroup = new ThreadGroup("My ThreadGroup");

        //create a thread
        MyRunnable myR2 = new MyRunnable();

        //创建线程组内的线程
        //Thread(ThreadGroup group, Runnable target, String name)
        Thread t1 = new Thread(my_threadGroup, myR2, "Thread-C");
        Thread t2 = new Thread(my_threadGroup, myR2, "Thread-D");
        System.out.println(t1.getThreadGroup().getName() + t1.getName());
        System.out.println(t2.getThreadGroup().getName() + t2.getName());
        t1.start();
        t2.start();

    }

    private static void method1() {
        MyRunnable myR1= new MyRunnable();

        Thread t1 = new Thread(myR1, "Thread-A");
        Thread t2 = new Thread(myR1, "Thread-B");

        //获取当前线程所在线程组名称
        // 我不知道他们属于那个线程组,我想知道，怎么办
        // 线程类里面的方法：public final ThreadGroup getThreadGroup()
        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();
        String tg1Name = tg1.getName();
        String tg2Name = tg2.getName();
        System.out.println(tg1Name);
        System.out.println(tg2Name);
        // 通过结果我们知道了：线程默认情况下属于main线程组
        // 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }

}
