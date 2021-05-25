package file;

/*
* 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
* 假如兔子都不死，问第20个月的兔子对数为多少？
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
* 思路1:递归方法
*       方法: 返回值int ; 参数类型月数 int ;出口: i ==1 || i ==2 return 1; 规律 从第三个月 开始 等于前2个月的之和.
* 思路2://数组的方式
* 思路3://变量的变化实现
*       第1个相邻数据:a = 1 b = 1
*       第2个相邻数据:a = 1 b = 2
*       第3个相邻数据:a = 2 b = 3
*       第4个相邻数据:a = 3 b = 5
*

* */
public class Demo07DiGui02 {
    public static void main(String[] args) {
        //递归方法
        System.out.println(method(20));

        //数组的方式
        int[] intArray = new int[20];
        intArray[0] = 1;
        intArray[1] = 1;
        for (int i = 2;  i < 20; i++) {
            intArray[i] = intArray[ i - 1] + intArray[ i - 2 ];
        }
        System.out.println(intArray[19]);

        //变量的变化实现
        int a = 1;
        int b = 1;
        for (int i = 0; i < 18; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(b);
    }
    public static int method(int i){
        if(i ==1 || i == 2){
            return 1;
        }
        return method(i - 1) + method(i - 2);
    }

}
