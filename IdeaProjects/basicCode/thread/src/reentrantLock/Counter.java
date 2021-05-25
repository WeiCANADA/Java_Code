package threadDemo.reentrantLock;
/*
* 从Java 5开始，引入了一个高级的处理并发的java.util.concurrent包，它提供了大量更高级的并发功能，能大大简化多线程程序的编写。

我们知道Java语言直接提供了synchronized关键字用于加锁，但这种锁一是很重，二是获取时必须一直等待，没有额外的尝试机制。

java.util.concurrent.locks包提供的ReentrantLock用于替代synchronized加锁，
*
* */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

 class Counter {
        private final java.util.concurrent.locks.Lock lock = new ReentrantLock();
        private int count;

        public void add(int n){
            lock.lock();
            //public boolean tryLock()
            try {
                count += n;
            }finally {
                lock.unlock();
            }
        }
        public void dec (int n){
            //boolean b = lock.tryLock();
            lock.tryLock();
            try{
                count -= n;
            }finally {
                lock.unlock();
            }
        }

    public int getCount() {
        return this.count;
    }
}
