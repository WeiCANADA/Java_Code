package arrayStudy;
/*
* 遍历数组:对数组当中每一个元素进行逐一,挨个儿处理.默认的处理方式是打印输出.
* */
public class arrayBianLi {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{10, 20, 30, 40, 50};
//        传统方法打印数组中每个元素
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
 //       固定长度循环打印
        System.out.println("固定长度循环打印");
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }
//        长度灵活的打印
        System.out.println("灵活长度循环打印");

        int len;
    len = array.length;
       for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }
}
