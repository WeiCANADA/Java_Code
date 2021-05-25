package threadDemo.method_WaitAndNotify;

public class GetThread implements Runnable{
    private final Student s;

    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            s.get();
        }
    }
}
