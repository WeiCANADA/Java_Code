package com.kkb.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		//�ؼ�ʹ�ò��裺
		//1. 	��׼��һ��URL��Ķ��� u
		URL url = new URL("https://itdage.com/kkb/kkbsms?key=xzk&number=13522200852&code=123456");
		//2. 	�򿪷��������ӣ��õ����Ӷ��� conn
		URLConnection conn = url.openConnection();
		//3. 	��ȡ�������ݵ��ֽ������� is
		InputStream is = conn.getInputStream();
		//4.	��isװ��Ϊ��һ�ζ�ȡһ�е��ַ������� br
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		//5.	����һ������
		String text = br.readLine();
		//6.	��ʾ
		System.out.println(text);
		//7.	�ͷ���Դ
		br.close();

	}

}
