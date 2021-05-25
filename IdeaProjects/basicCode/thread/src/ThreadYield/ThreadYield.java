package threadDemo.ThreadYield;

public class ThreadYield extends Thread{
    public ThreadYield() {
    }

    public ThreadYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i<100 ; i++){
            System.out.println(getName()+i);

            //public static void yield()
            Thread.yield();
        }
    }
}
