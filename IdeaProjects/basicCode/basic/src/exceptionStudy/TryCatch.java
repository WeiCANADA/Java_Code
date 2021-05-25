package exceptionStudy;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){

            //Throwable 类的三个常用方法
            //1.public String getMessage()
            System.out.println(e.getMessage());

            //2.public String toString()
            System.out.println("=================");
            System.out.println(e.toString());


            //3.public Throwable getStackTrace()
            System.out.println("=================");
           e.printStackTrace();
        }
    }
}
