package IOStreamStudy.systeminAndout;

import java.io.PrintStream;

/*
 * 标准输入输出流
 * System类中的两个成员变量：
 *		public static final InputStream in “标准”输入流。
 * 		public static final PrintStream out “标准”输出流。
 *
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 */
public class Demo01Systemout {
    public static void main(String[] args) {

        PrintStream printStream = System.out;
        printStream.print(10);
        printStream.flush();

        printStream.println(10);

        System.out.println(10);

        printStream.close();
    }
}
