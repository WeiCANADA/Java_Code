package classCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionObject {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("刘思坦",5);
        Student s2 = new Student("六曦冉",3);
        Student s3 = new Student("刘加一",1);
        //将学生对象加入结合c
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //迭代器迭代
        Iterator<Student> it = c.iterator();
        //遍历集合
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }


}
