package threadDemo.method_WaitAndNotify;

public class StudentDemo {
    public static void main(String[] args) {
        //create the resource
        Student s = new Student();

        //Set and Get Class
        SetThread st = new SetThread(s);
        GetThread gt = new GetThread(s);

        //Thread Class
        Thread t1 = new Thread(st, "Thread Set");
        Thread t2 =  new Thread(gt, "Thread.Get");

        t1.start();
        t2.start();
    }
}
