package practice;
/*
* 使用对象类型作为方法的参数
* */
public class Method {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.color = "Gold";
        one.price = 8999.0;

        method(one);
    }
    public static  void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
