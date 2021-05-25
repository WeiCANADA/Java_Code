package study1;
/*
 * 面向对象的特点:
 * 封装,
 * 继承,
 * 多态
 *
 * class 与对象的关系:
 *
 * 定义一个类,用来模拟'学生'事物.其中就有两个组成部分:
 *
 * 属性(是什么):
 * 姓名
 * 年龄
 * 行为(能做什么)
 * 吃饭
 * 睡觉
 * 学习
 * 对于到Java的类当中:
 *
 * 成员变量(属性):
 * String name;
 * int age;
 *
 * 成员方法:
 * public void eat () {}
 * public void sleep(){}
 * public void study(){}
 *

 *
 * */
public class Student {
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉觉");
    }
    public void study(){
        System.out.println("学习");
    }
}

