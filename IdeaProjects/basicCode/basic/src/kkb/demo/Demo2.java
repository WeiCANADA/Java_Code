package com.kkb.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		//关键使用步骤：
		//1. 	先准备一个URL类的对象 u
		URL url = new URL("http://www.4399.com");
		//2. 	打开服务器连接，得到连接对象 conn
		URLConnection conn = url.openConnection();
		//3. 	获取加载数据的字节输入流 is
		InputStream is = conn.getInputStream();
		//4.	将is装饰为能一次读取一行的字符输入流 br
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//5.	加载一行数据
		String text = br.readLine();
		//6.	显示
		System.out.println(text);
		//5.	加载一行数据
		String text2 = br.readLine();
		//6.	显示
		System.out.println(text2);
		//5.	加载一行数据
		String text3 = br.readLine();
		//6.	显示
		System.out.println(text3);
		//5.	加载一行数据
		String text4 = br.readLine();
		//6.	显示
		System.out.println(text4);
		//5.	加载一行数据
		String text5 = br.readLine();
		//6.	显示
		System.out.println(text5);
		//5.	加载一行数据
		String text6 = br.readLine();
		//6.	显示
		System.out.println(text6);
		//7.	释放资源
		br.close();

	}

}
