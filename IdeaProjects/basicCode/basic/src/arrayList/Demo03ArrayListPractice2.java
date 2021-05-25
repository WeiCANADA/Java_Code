package arrayList;
/*
* 题目:自定义4个学生对象,添加到集合,并遍历;
* */
import javaBean.Student;

import java.util.ArrayList;

public class Demo03ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu = new Student("Liu,sitan",5);
        Student stu1 = new Student("Liu,Xiran",2);
        Student stu2 = new Student("Liu,Jiayi",1);
        Student stu3 = new Student("Liu,stan",5);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + s.getAge());
        }

    }
}

