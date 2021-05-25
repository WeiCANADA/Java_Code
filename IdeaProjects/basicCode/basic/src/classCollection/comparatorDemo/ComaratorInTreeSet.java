package classCollection.comparatorDemo;
/*
* 存储学生对象并遍历,创建TreeSet集合并使用带参构造方法
* 要求:按照年龄从小到大排序,年龄相同时,按照姓名的字母顺序排列.
* */

import java.util.Comparator;
import java.util.TreeSet;

public class ComaratorInTreeSet {
    public static void main(String[] args) {
        //创建TreeSet 有参对象
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
               // return 0; //Liu,sitan,5
                //return 1;//Liu,sitan,5 Liu,Sitan,5 Liu,xiran,2 Liu,xiran,3 Liu,jiayi,2 Liu,Jiayi,1
             //return -1;//Liu,Jiayi,1  Liu,jiayi,2  Liu,xiran,3  Liu,xiran,2  Liu,Sitan,5  Liu,sitan,5

                //只比较年龄
               // int i = s1.getAge() - s2.getAge();
            //return i;//Liu,Jiayi,1  Liu,xiran,2  Liu,xiran,3  Liu,sitan,5

                //只比较姓名
                /*String str = s1.getName();
                int i = str.compareTo(s2.getName());
                return i*/;//Liu,Jiayi,1  	 Liu,Sitan,5	 Liu,jiayi,2  Liu,sitan,5 	 Liu,xiran,2

                //先比较age,后比较name
                String str1 = s1.getName();
                String str2 = s2.getName();
                  int i = s1.getAge() - s2.getAge();
                  i = i==0? str1.compareTo(str2) : i;
                  return i;//Liu,Jiayi,1	Liu,jiayi,2	Liu,xiran,2Liu,xiran,3	Liu,Sitan,5	Liu,sitan,5
            }
        });

        //创建学生对象

        Student s1 = new Student("Liu,sitan",5);
        Student s2 = new Student("Liu,Sitan",5);

        Student s3 = new Student("Liu,xiran",2);
        Student s4 = new Student("Liu,xiran",3);

        Student s5 = new Student("Liu,jiayi",2);
        Student s6 = new Student("Liu,Jiayi",1);

        //添加学生对象到TreeSet集合对象
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);

        //增强for循环遍历
        for (Student s : treeSet){
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
