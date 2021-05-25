package threadDemo.reentrantLock.condition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskQueue {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final Queue<String> queue = new LinkedList<>();
    boolean flag;

    public void offerQueue(String s) {
        lock.lock();
        try {
                queue.offer(s);
                condition.signal();

        } finally {
            lock.unlock();
        }
    }

    public void remove() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(queue.remove());
        } finally {
            lock.unlock();
        }

    }
}


