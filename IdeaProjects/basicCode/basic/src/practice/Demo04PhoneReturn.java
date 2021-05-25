package practice;
/*
* 使用对象类型作为方法的返回值
* */
public class Demo04PhoneReturn {
    public static void main(String[] args) {
       Phone two = getPhone();
        printMethod(two);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.price = 8388.0;
        one.color = "RoseGold";
        one.brand = "Apple";
        return one;
    }
    public static void printMethod(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
