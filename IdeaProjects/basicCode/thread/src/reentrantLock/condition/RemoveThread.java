package threadDemo.reentrantLock.condition;

public class RemoveThread implements Runnable {
    private final TaskQueue taskQueue;

    public RemoveThread(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            taskQueue.remove();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
