package classCollection.setClass;

import classCollection.Student;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建LinkedHashSet 集合对象
        TreeSet<Student> treeSet = new TreeSet<>();

        // create Student 对象
        Student s3 = new Student("Liu,Jiayi",2);
        Student s2 = new Student("Liu,Xiran",2);
        Student s4 = new Student("Liu,Jiayi",1);
        Student s1 = new Student("Liu,Sitan",5);

        //添加对象到集合
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        //遍历结合
        for (Student s : treeSet){
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }
}
