/*
ѭ�����
������ɲ���,һ����Է�Ϊ�ĸ�����:
��ʼ�����
�����ж�:������ѭ������,������,ѭ���˳�;
ѭ����
�������:ÿ��ѭ��֮��Ҫ���е�ɨβ����,ÿ��ѭ����Ҫִ��һ��.
1.forѭ��
for(��ʼ�����ʽ1;�������ʽ2;�������ʽ4){
	ѭ����3
}
ִ������
1234>234>234...2������Ϊֹ.

while ѭ����
��ʽ:
	��׼��ʽ:
		while(�����ж�){
			ѭ����;
		}
	��չ��ʽ:
		��ʼ�����;
		while(�����ж�){
			ѭ����;
			�������;
		}
	
do...while���
	��ʽ:
		��ʼ�����ʽ;
		do{
			ѭ����;
			�������ʽ;
		}while(�������ʽ);
*/
public class Demo01For{
	public static void main(String[] args){
		for(int i = 1;i <= 10;i++){
			System.out.println(i + ":" + "�Ҵ���!");
		}
		System.out.println("����ֹͣ");
		
		System.out.println("While ѭ��ʾ��");
		int i = 1;
		while(i <= 10){
			System.out.println(i + ":" + "�Ҵ���!");
			i++;
		}
		
		System.out.println("do...While ѭ��ʾ��");
		
		int a = 1;
	do{
		System.out.println(a  + ":" + "�Ҵ���!");
		a ++;
	}while(a <= 10);
	}
}