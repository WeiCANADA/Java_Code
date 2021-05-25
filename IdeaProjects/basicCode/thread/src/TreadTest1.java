package threadDemo;

import java.util.Date;

public class TreadTest1 {
    public static void main(String[] args) {
        //创建新线程
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        //或许默认线程优先级并输出
        int i1 = a.getPriority();
        int i2 = b.getPriority();
        System.out.println(i1);
        System.out.println(i2);

        //设置优先级 默认字段方法 1~10
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        // b.setPriority(Thread.NORM_PRIORITY);
        // b.setPriority(9);

        i1 = a.getPriority();
        i2 = b.getPriority();
        System.out.println(i1);
        System.out.println(i2);

        //启动线程
        a.start();
        b.start();

    }
}
