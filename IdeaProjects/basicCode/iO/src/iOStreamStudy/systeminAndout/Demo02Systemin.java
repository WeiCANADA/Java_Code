package IOStreamStudy.systeminAndout;

import java.io.*;

/*
 * System.in 标准输入流。是从键盘获取数据的
 *
 * 键盘录入数据：
 * 		A:main方法的args接收参数。
 * 			java HelloWorld hello world java
 * 		B:Scanner(JDK5以后的)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		C:通过字符缓冲流包装标准输入流实现
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class Demo02Systemin {
    public static void main(String[] args) throws IOException {
        //类 System ;	public static final InputStream in “标准”输入流。
        InputStream inputStream = System.in;
        //字节流
       // BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        //字符流

       // InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//字节流转为字符流
       // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //三合一.readline 方法只有BufferedReader 有
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串:");
        String line = bufferedReader.readLine();
        System.out.println("你输入的字符串是:" + line);

        System.out.println("请输入一个整数:");
        line = bufferedReader.readLine();
        int i = Integer.parseInt(line);
        System.out.println("你输入的整数是:" + i);
    }
}
