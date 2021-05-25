package com.kkb.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		//关键使用步骤：
		//0.	将发送给图灵机器人的文字转化为URL编码
		String question = URLEncoder.encode("给爷讲个段子", "UTF-8");
		//1. 	先准备一个URL类的对象 u
		URL url = new URL("https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question="+question);
		//2. 	打开服务器连接，得到连接对象 conn
		URLConnection conn = url.openConnection();
		//3. 	获取加载数据的字节输入流 is
		InputStream is = conn.getInputStream();
		//4.	将is装饰为能一次读取一行的字符输入流 br
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		//5.	加载一行数据
		String text = br.readLine();
		//6.	显示
		System.out.println(text);
		//7.	释放资源
		br.close();

	}

}
