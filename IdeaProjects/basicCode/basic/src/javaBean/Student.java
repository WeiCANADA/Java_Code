package javaBean;
/*
* 一个标准类
* 1.成员变量
* 2.为每个成员变量编写一对Getter/Setter方法
* 3.编写一个无参数的构造方法
* 4.编写一个全参数的构造方法
*
* */
public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
