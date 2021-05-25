package classCollection.setClass;

import classCollection.Student;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //Create HashSet 集合对象
        HashSet<Student> hashSet = new HashSet();

        // create Student 对象
        Student s1 = new Student("Liu,Sitan",5);
        Student s2 = new Student("Liu,Xiran",2);
        Student s3 = new Student("Liu,Jiayi",1);
        Student s4 = new Student("Liu,Jiayi",1);

        //添加对象到集合
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

        //遍历集合
        //OverRide equals 和 hashcode 方法
        for(Student s : hashSet){
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }
}
