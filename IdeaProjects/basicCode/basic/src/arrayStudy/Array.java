package arrayStudy;
/*
* 数组的概念,是一种容器,可以同时存放多个数据
* 特点:
* 1.数组是一种引用数据类型;
* 2.数组当中的多个数据,;类型必须统一;
* 3.数组的长度在程序运行期间不能改变.
*常见的初始化方式
* 基本格式:
* 1.动态初始化(指定长度);
* 2.静态初始化(枚举).
* 数据类型[] 数据名称 = new 数据类型[数组长度];
* 数据类型[] 数据名称 = new 数据类型[] {元素1, 元素2,...};
*
* 省略格式的静态初始化:
* * 数据类型[] 数据名称 = {元素1, 元素2,...};
*
* 打印数组名称,得到的是数组对应的: 内存地址哈希值.
*
* 访问数组元素的格式: 数组名称[索引值]
* 索引值:一个int数字, 代表数组当中元素的编号, 从0开始.
*
* 使用动态初始化数组的时候,其中元素会自动拥有一个默认值,规则如下:
* int,默认为0;
* float,默认0.0;
* char,默认'\u0000';
* boolean,默认是false;
* 引用类型,默认为null;
*
* 获取数组长度
* 数组名称.length
*
* 数组一旦被创建,程序运行期间,长度就不能改变.

 * */
public class Array {
    public static void main(String[] args) {
//        动态初始化举例
        int[] arrayA = new int[3];
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];
        System.out.println(arrayA);//内存地址
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        arrayA[1] = 123;
        arrayA[2] = 321;
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//123
        System.out.println(arrayA[2]);//321

//        静态初始化举例
        int[] arrayD = new int[] {5, 15, 25};
        String[] arrayE = new String[] {"Hello", "World", "Java"};
//        简化静态初始化举例
        String[] arrayF = {"Hello", "World", "Java"};
//数组初始化也可以拆分2步,先定义数据类型,第二步指定数组长度或枚举,但不能用简化模式.
        String[] arrayG;
        arrayG = new String[] {"Hello", "World", "Java"};

        System.out.println(arrayA);//[I@1b6d3586
        System.out.println(arrayG[0]);
        System.out.println(arrayG[1]);
        System.out.println(arrayG[2]);
        //获取数组长度
        int len = arrayA.length;
        System.out.println(len);
    }
}
