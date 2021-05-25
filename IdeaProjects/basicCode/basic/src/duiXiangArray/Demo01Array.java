package duiXiangArray;
//题目:定义一个数组,用来存储3个Person对象
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("刘思坦",5);
        Person two = new Person("刘曦冉",2);
        Person three = new Person("刘加一",1);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0].getName());

    }
}
