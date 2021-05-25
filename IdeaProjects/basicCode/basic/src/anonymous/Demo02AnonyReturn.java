package anonymous;

import java.util.Scanner;

public class Demo02AnonyReturn {
    public static void main(String[] args) {
        //普通方式
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();*/
        //匿名对象方式
        /*int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是" + num );*/

        //匿名对象作为方法参数进行传递
        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        System.out.println("数字是:");
        int num = sc.nextInt();
        System.out.println("输入的是:" + num);
    }
    public static void methodParam(Scanner sc){
        System.out.println("The number is:");
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
