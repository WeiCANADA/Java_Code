package staticStudy;

/*
*静态代码块
* 格式
* public class 类名称{
* static {
* // 静态代码块
* }
*
* 特点:
* 当第一次用到本类时,静态代码块只执行一次.
* 典型用途:
* 一次地对静态成员变量进行赋值.
* */
public class Person {
    static {
        System.out.println("静态代码块执行!");
    }
    public Person(){
        System.out.println("构造方法执行");
    }
}
