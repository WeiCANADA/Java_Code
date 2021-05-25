package classCollection.setClass;

import classCollection.Student;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建LinkedHashSet 集合对象
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        // create Student 对象
        Student s1 = new Student("Liu,Sitan",5);
        Student s2 = new Student("Liu,Xiran",2);
        Student s3 = new Student("Liu,Jiayi",1);
        Student s4 = new Student("Wang,Jiayi",1);

        //添加对象到集合
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);
        linkedHashSet.add(s4);

        //遍历结合
        for (Student s : linkedHashSet){
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }
}
