package anonymous;

import javaBean.Student;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Student stu = new Student ();
        stu.setName("高圆圆");
        System.out.println(stu.getName());
        // 匿名对象
        new Student().setName("赵又廷");
        System.out.println(new Student().getName());//null
    }
}
