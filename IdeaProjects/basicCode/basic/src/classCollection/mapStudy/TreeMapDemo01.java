package classCollection.mapStudy;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("刘思坦",5);
        Student s2 = new Student("刘曦冉",2);
        Student s3 = new Student("刘加一",5);
        Student s4 = new Student("刘加一",1);


        Map<Student, Integer> treeMap = new TreeMap(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = s1.getiD() - s2.getiD();
                String name1 = s1.getName();
                String name2 = s2.getName();
                i = i == 0 ? name1.compareTo(name2) : i;
                return i;
            }
        });
        treeMap.put(s1, 232);
        treeMap.put(s2, 435);
        treeMap.put(s3, 112);
        treeMap.put(s4, 444);

        //Student student = treeMap.get();
        Set<Student> studentsSet = treeMap.keySet();
        for (Student student : studentsSet){
            int iD = student.getiD();
            String name = student.getName();
            int value = treeMap.get(student);
            System.out.println( name + iD + value);
        }
    }
}
