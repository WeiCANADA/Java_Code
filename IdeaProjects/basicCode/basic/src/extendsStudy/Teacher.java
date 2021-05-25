package extendsStudy;
//使用extends 使Teacher 作为Employee的子类继承Employee的成员变量,构造方法,和方法.
public class Teacher extends Employee {
 int num = 20;//重名成员变量示例
    @Override //安全监测方法覆盖重写是否正确
    public void methodChongMing(){
        System.out.println("Teacher 重名方法执行!");
    }
    //区分子类方法中重名的三种变量
    public void methodT(){
        int num = 21;
        System.out.println(num);//21
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }
}
