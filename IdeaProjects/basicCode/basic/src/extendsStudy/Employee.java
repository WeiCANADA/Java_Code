package extendsStudy;

public class Employee {
    int num = 10;//重名成员变量示例
    int num1 = 11;//只有父类有的成员变量;
    public void method(){
        System.out.println("Employee 方法执行!");
    }
    public void methodChongMing(){
        System.out.println("Employee 重名方法执行!");
    }


}
