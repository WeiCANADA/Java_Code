package classCollection.classCollections;
/*
* 需求:ArrayList存储学生对象,使用Collections 对ArrayList 进行排序
* 要求: 按照年龄从小到大,年龄相同时候,按照姓名字母顺序排列
* 思路:ArrayList 集合
* Collection sort
* */

import arrayStudy.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        Student s1 = new Student("liusitan",5);
        Student s2 = new Student("liuxiran",2);
        Student s3 = new Student("liujiayi",1);
        Student s4 = new Student("liuyi",2);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = s1.getAge() - s2.getAge();
                i = i == 0 ? s1.getName().compareTo(s2.getName()) : i;
                return i;
            }
        });

        for(Student student : studentArrayList){
            System.out.println(student.getName() + "\t" + student.getAge());
        }
    }
}