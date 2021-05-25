package threadDemo.reentrantLock.condition;

public class TestQueueTest {
    public static void main(String[] args) {
        //创建资源对象
        TaskQueue taskQueue = new TaskQueue();

        //创建线程
        OfferThread offerThread = new OfferThread(taskQueue);
        RemoveThread removeThread = new RemoveThread(taskQueue);
        Thread thread = new Thread(offerThread, "尾部添加元素");
        Thread thread1 = new Thread(removeThread, "取出并删除头部元素");

        thread.start();
        thread1.start();
    }
}
