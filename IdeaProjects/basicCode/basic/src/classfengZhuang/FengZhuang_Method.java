package classfengZhuang;

/*封装:
1.方法;
2.private .
*
* 定义一个方法找出数组里的最大值
*
* */
public class FengZhuang_Method {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50};
        max(array);
        /*
         * 三要素
         * 返回值类型:int
         * 方法名:max
         * 参数列表:int[] array
         * */
    }
    public static void max(int[] array) {
        int maxM = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(maxM < array[i]){
                maxM = array[i];
            }
        }
        System.out.println("数组里的最大值:" + maxM);
    }

}
