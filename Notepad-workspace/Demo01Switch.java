/*
switch ���
��ʽ:
switch(���ʽ){
	case ����1:
	�����;
	break;
	case ����2:
	�����;
	break;
	...
	defaut:
	�����n+1;
	break;
	
	Switch ע������
	1.���case�������ֵ�������ظ�.
	2.Switch �����С���ŵ���ֻ����������������:
	������������:byte/short/int/char
	������������:String�ַ���\enumö��
	3.switch�����Ժ����:ǰ��˳ȥ���Եߵ�,����break������ʡ��.
	ƥ����һ��case�ʹ���������ִ��,֪��������break��ִ�����.
}
*/
public class Demo01Switch{
	public static void main(String[] args){
		int num;
		num = 8;
		switch(num){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
				System.out.println("Sunday");
			default:
				System.out.println("��������ݲ���ȷ");
			break;
		}
	}
}