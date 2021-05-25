package practice;

public class PhoneOne {
    public static void main(String[] args) {
       //导包,在同一包下,可以省略
        //调用 成员变量: 调用类名 对象名 = new 调用对象();
        Phone phoneOne = new Phone();
        System.out.println(phoneOne.brand);//null
        System.out.println(phoneOne.price);//o.o
        System.out.println(phoneOne.color);//null
        phoneOne.brand = "Apple";
        phoneOne.price = 5999;
        phoneOne.color = "Black";
        System.out.println(phoneOne.brand);
        System.out.println(phoneOne.price);
        System.out.println(phoneOne.color);
        //调用类Phone的方法
        phoneOne.call("刘思坦");
        phoneOne.sendMessage();
        System.out.println("================");
        Phone phoneTwo = new Phone();
        System.out.println(phoneTwo.brand);//null
        System.out.println(phoneTwo.price);//0.0
        System.out.println(phoneTwo.color);//null
        phoneTwo.brand = "svsung";
        phoneTwo.price = 7999;
        phoneTwo.color = "silver";
        System.out.println(phoneTwo.brand);//svsung
        System.out.println(phoneTwo.price);//7999
        System.out.println(phoneTwo.color);//silver
        //调用类Phone的方法
        phoneTwo.call("刘曦冉");
        phoneTwo.sendMessage();
        System.out.println("================");
        Phone phoneThree = phoneTwo;
        System.out.println(phoneThree.brand);//svsung
        System.out.println(phoneThree.price);//7999
        System.out.println(phoneThree.color);//silver
        phoneThree.brand = "OPPO";
        phoneThree.price = 3999;
        phoneThree.color = "GOLD";
        System.out.println(phoneThree.brand);
        System.out.println(phoneThree.price);
        System.out.println(phoneThree.color);

    }
}
