/*
ȡģ��ֻ���ڶ������ĳ���ȡģ
ע�����
	1.���㵱���в�ͬ���͵����ݣ�����������������ͷ�Χ������֡�
	
	��+���ĳ��������÷�
	1.������ֵ���Ǽӷ�
	2.����char������˵���ڼ���ǰ��char�ᱻ����Ϊint��Ȼ���ڼ��㣻
	3.�����ַ���String������ĸ��д�������ǹؼ��֣�����+����ʾ�ַ������Ӳ���
	4.�κ��ַ����ͺ��ַ����������ӵ�ʱ�򣬽���������ַ���
*/
public class Demo04Operator{
	public static void main(String[] arsg){
		int x = 10;
		int y = 3;
		int result1 = x % y;
		System.out.println(result1);
		
		System.out.println("========="+"�ַ���plus");
		//�ַ������͵ı�������ʹ�÷���
		//�������� �������� = ����ֵ��
		String str1 = "Hello";
		System.out.println(str1);	//hello
		System.out.println(str1+"World");
		System.out.println(str1 + 20);		//Hello20
		System.out.println(str1+20+30);		//Hello2030
		System.out.println(str1+(20+30));	//Hello50
	}
	
}