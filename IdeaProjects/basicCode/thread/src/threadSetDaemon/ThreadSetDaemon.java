package threadDemo.threadSetDaemon;

public class ThreadSetDaemon extends Thread{
    public ThreadSetDaemon() {
    }

    public ThreadSetDaemon(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i<100 ; i++){
            System.out.println(getName()+i);
        }
    }
}
