package arrayStudy;
/**/

public class arrayPractice2 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

/*
* 初始化语句: int min = 0, max = array.length - 1;
* 条件判断:min < max;
* 步进表达式:min++, max--
* 循环体:用第三个变量倒手
* */
        for (int min = 0, max = array.length - 1;  min < max; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
