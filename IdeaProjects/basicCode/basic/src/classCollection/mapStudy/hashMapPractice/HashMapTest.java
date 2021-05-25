package classCollection.mapStudy.hashMapPractice;

import java.util.HashMap;
import java.util.Set;

/*
* 需求:
*   创建一个Has和Map集合,Key是学生对象Student ,value 工作地点.存储多个建制对元素,并遍历.
* 思路:
*   1.定义学生类
*   2.创建HashMap 集合对象
*   3.把学生添加到集合
*   4.遍历结合
*   5.在学生类中重写两个方法
*       hashCode();
*       equals();
*
* */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Student, String> studentStringHashMap = new HashMap<>();

        Student s1 = new Student("刘思坦", 5);
        Student s2 = new Student("刘曦冉", 2);
        Student s3 = new Student("刘加一",1);
        Student s4 = new Student("刘加一",1);

        studentStringHashMap.put(s1, "Fredericton");
        studentStringHashMap.put(s2, "Fredericton");
        studentStringHashMap.put(s3, "Fredericton");
        studentStringHashMap.put(s4, "Moncton");

        Set<Student> studentSet = studentStringHashMap.keySet();
        for(Student student : studentSet){
            String value = studentStringHashMap.get(student);
            System.out.println(student.getName() +"\t" + student.getAge() + "\t" + value);
        }
    }
}
