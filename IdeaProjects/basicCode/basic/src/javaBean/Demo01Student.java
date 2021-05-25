package javaBean;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(5);
        stu1.setName("刘思坦");
        System.out.println(stu1.getName() + stu1.getAge());
        System.out.println("=====================");
        Student stu2 = new Student("刘曦冉", 2);
        System.out.println(stu2.getName() + stu2.getAge());
        stu2.setAge(3);
        System.out.println(stu2.getName() + stu2.getAge());
    }

}
