public class Demo02Method{
	public static void main(String[] args){
		short num1 = 10; //��ȷд��,�Ҳ�intû�г������short �ķ�Χ
		
		short a = 5;
		short b = 8;
		//short + short -->int + int -->int
		//short result = a + b;//����д��!�����Ҫ��int����
		int result = a + b;
		 short result1 = 5 + 7;
		 /*�ٸ��������и�ֵ��ʱ��,����Ҳ���ʽ���ȫ���ǳ���,
		 û���κα���,��ô������javac ��ֱ�����ɸ��������ʽ����õ����.short result = 5 + 8;
		 ��class �ļ���ֱ�Ӿ��� short result = 13;*/
		 System.out.println(result);
		 System.out.println(result1);
	}
}