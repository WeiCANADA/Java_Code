package arrayStudy;
           /*
           * 数组可以作为参数传递给方法,     传递进去的是数组地址;
           * 方法也可以返回数组,以实现返回多个返回值,返回的是数组地址.
           *
           * */
public class arrayPractice3 {
    public static void main(String[] args) {
        int[] array1 = new int[] {10, 20, 30, 40, 50};
        int[] arrayA = new int[] {10, 20, 30};
        printArray(array1);
        int[] result = calculate(arrayA);
        System.out.println("arrayA数组之和:" + result[0]);
        System.out.println("arrayA数组平均值:" + result[1]);
    }
    /*
    * 三要素:
    * 返回值类型,只是进行打印,不需要计算,也没有结果,故用void
    * 方法名: printArry
    * 参数列表:必须给我数组,int[] array
    * */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] calculate(int[] array){
           int sum = array[0] + array[1] +array[2];
           int avg = sum/ array.length;
            //希望2个值都返回
            int[] arrayB = new int[2];
            arrayB[0] = sum;
            arrayB[1] = avg;
            return arrayB;
        }
}
