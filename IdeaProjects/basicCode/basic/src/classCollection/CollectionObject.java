package classCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionObject {
    public static void main(String[] args) {
        //����Collection���϶���
        Collection<Student> c = new ArrayList<Student>();

        //����ѧ������
        Student s1 = new Student("��˼̹",5);
        Student s2 = new Student("����Ƚ",3);
        Student s3 = new Student("����һ",1);
        //��ѧ�����������c
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //����������
        Iterator<Student> it = c.iterator();
        //��������
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }


}
