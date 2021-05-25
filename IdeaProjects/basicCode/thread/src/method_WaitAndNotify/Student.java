package threadDemo.method_WaitAndNotify;

public class Student {
    private String name;
    private int age;
    private boolean flag;

    //set method
    public synchronized void set(String name , int age) {
        if(this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.name = name;
            this.age = age;
        }
        // 修改标记
        this.flag = true;
        this.notify();
    }

    //get method
    public synchronized void get(){
        if(!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + "\\" + this.age);
        }
        // 如果没有数据，就等待
        // 修改标记
        this.flag = false;
        this.notify();
    }
}
