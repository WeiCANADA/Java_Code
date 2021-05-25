package file;
/*
* 需求:用递归方法实现5!
*
* */
public class Demo06DiGui {
    public static void main(String[] args) {
        int i = jieChengM(5);

    }
    public static int jieChengM(int i){
        if(i == 1){
            return 1;
        }else {
            return  i * jieChengM(i - 1);
        }
    }
}
