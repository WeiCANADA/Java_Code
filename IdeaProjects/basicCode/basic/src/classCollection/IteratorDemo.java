package classCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("great");
        c.add("Java");
        //Iterator<E> iterator()/返回在此 collection 的元素上进行迭代的迭代器。
        Iterator<String> it = c.iterator();
       // 获取元素 E next()
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
