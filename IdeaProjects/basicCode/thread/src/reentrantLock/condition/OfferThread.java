package threadDemo.reentrantLock.condition;

public class OfferThread implements Runnable{
    private final TaskQueue taskQueue;
    private int i;

    public OfferThread(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true){
            if(i % 2 == 0){
                taskQueue.offerQueue("刘德华");
            }else {
                taskQueue.offerQueue("周星驰");
            }
            i++;
        }
    }
}
