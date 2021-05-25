package arrayStudy;
/*求数组中的最大值*/
public class arrayPractice1 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 50, 10000};
        int max = array[0];
        for (int i = 1; i <array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("最大值:" + max);
    }
}
