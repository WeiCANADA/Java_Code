package com.kkb.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		//�ؼ�ʹ�ò��裺
		//1. 	��׼��һ��URL��Ķ��� u
		URL url = new URL("http://www.4399.com");
		//2. 	�򿪷��������ӣ��õ����Ӷ��� conn
		URLConnection conn = url.openConnection();
		//3. 	��ȡ�������ݵ��ֽ������� is
		InputStream is = conn.getInputStream();
		//4.	��isװ��Ϊ��һ�ζ�ȡһ�е��ַ������� br
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//5.	����һ������
		String text = br.readLine();
		//6.	��ʾ
		System.out.println(text);
		//5.	����һ������
		String text2 = br.readLine();
		//6.	��ʾ
		System.out.println(text2);
		//5.	����һ������
		String text3 = br.readLine();
		//6.	��ʾ
		System.out.println(text3);
		//5.	����һ������
		String text4 = br.readLine();
		//6.	��ʾ
		System.out.println(text4);
		//5.	����һ������
		String text5 = br.readLine();
		//6.	��ʾ
		System.out.println(text5);
		//5.	����һ������
		String text6 = br.readLine();
		//6.	��ʾ
		System.out.println(text6);
		//7.	�ͷ���Դ
		br.close();

	}

}
