package classCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //�������϶���
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("great");
        c.add("Java");
        //Iterator<E> iterator()/�����ڴ� collection ��Ԫ���Ͻ��е����ĵ�������
        Iterator<String> it = c.iterator();
       // ��ȡԪ�� E next()
        String str =it.next();
        //boolean hasNext()
        while (it.hasNext()){
            System.out.println(str);
        }
    }
}
/*
* public Iterator<E> iterator() {
        return new Itr();
    }
    private class Itr implements Iterator<E> {
    ....
    }

* */
