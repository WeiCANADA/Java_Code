package threadDemo.method_WaitAndNotify;

public class SetThread implements Runnable{
    private final Student s;
    private int x = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                s.set("Stan", 6);
            } else {
                s.set("RyAnn", 3);
            }
            x++;
        }
    }
}
