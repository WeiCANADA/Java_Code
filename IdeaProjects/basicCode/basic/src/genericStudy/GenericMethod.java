package genericStudy;
/*
* 泛型方法
* public <T> 返回值类型 方法名(T t)
* */

public class GenericMethod {
    public <T> void show(T t){
        System.out.println(t);
    }
}
