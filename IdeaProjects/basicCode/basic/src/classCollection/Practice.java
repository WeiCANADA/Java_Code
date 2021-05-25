package classCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("刘思坦",5);
        Student s1 = new Student("刘曦冉",2);
        Student s2 = new Student("刘加一",1);

        //创建List集合并添加学生对象到集合
        List<Student> sL = new ArrayList<>();
        sL.add(s);
        sL.add(s1);
        sL.add(s2);


        //迭代器方法遍历结合
        ListIterator<Student> listIterator = sL.listIterator();
        while (listIterator.hasNext()){
            Student student = listIterator.next();
            System.out.println("姓名:" + student.getName() + "\t" + "年龄:" + student.getAge() + "岁");
        }

        //普通for循环:带有索引的遍历方式
        System.out.println("==============");
        for (int i = 0; i < sL.size(); i++) {
            Student student = sL.get(i);
            System.out.println("姓名:" + student.getName() + "\t" + "年龄:" + student.getAge() + "岁");
        }

        System.out.println("=========");
        //增强for:最方便的遍历方式
        for (Student st : sL) {
            System.out.println("姓名:" + st.getName() + "\t" + "年龄:" + st.getAge() + "岁");
        }




    }
}
