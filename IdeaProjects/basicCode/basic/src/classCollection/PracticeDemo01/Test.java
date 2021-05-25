package classCollection.PracticeDemo01;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("刘思坦",90.5,89);
        Student s3 = new Student("刘加一",79,89);
        Student s2 = new Student("刘曦冉",90.5,88);
        Student s4 = new Student("刘思",95,99);
        Student s5 = new Student("刘加一",95,99);

        TreeSet<Student> treeSet = new TreeSet<Student>(/*(new Comparator<Student> {
           @Override
            public int compare(Student s1, Student s2) {
                int i = s2.getSum() - s1.getSum();
                return i;
            }
        }*/);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        //增强for循环遍历
        for (Student s : treeSet){
                System.out.println(s.getName() + ", Chinese"+ s.getChinese() + ", Math" + s.getMath());
        }

        //Iterator 迭代器遍历
        System.out.println("======================");
        Iterator<Student> it = treeSet.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + ", Chinese"+ s.getChinese() + ", Math" + s.getMath());
        }
    }
}
