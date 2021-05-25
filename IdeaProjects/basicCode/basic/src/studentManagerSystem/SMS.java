package studentManagerSystem;
/*
*
* */
import java.util.ArrayList;
import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {
        //�������϶������ڴ洢ѧ������
        ArrayList<Student> array = new ArrayList<>();
        //��������ʾ
        /*
        * 1.�����������������ı�д
        * 2.��Scanner ʵ�ּ���¼������
        * 3.��switch�����ɲ���ѡ��
        * 4.��ѭ������ٴη���������
        * */
        while(true){
        System.out.println("----��ӭ����ѧ������ϵͳ----");
        System.out.println("1. ���ѧ��");
        System.out.println("2. �鿴ȫ��ѧ��");
        System.out.println("3. �޸�ѧ��");
        System.out.println("4. ɾ��ѧ��");
        System.out.println("5. �˳�ϵͳ");
        System.out.println("��������Ž���ѡ��:");

        //ѡ�����1
            //��������ѡ��
        Scanner choose = new Scanner(System.in);
        int choosedNum = choose.nextInt();
        switch (choosedNum) {
            case 1:
                //System.out.println("���ѧ��:");
                addStudent(array);
                break;
            case 2:
               // System.out.println("�鿴ȫ��ѧ��");
                findAllStudents(array);
                break;
            case 3:
                //System.out.println("�޸�ѧ��");
                updateStudent(array);
                break;
            case 4:
                //System.out.println("ɾ��ѧ��");
                deleteStudent(array);
                break;
            case 5:
                System.out.println("���Ѿ��ɹ��˳�ϵͳ");
                System.exit(0);
            default:
                System.out.println("�����������������");
        }


        }


    }

    //methods
    //����һ���������ѧ��
    public static void addStudent(ArrayList<Student> array){
        //�����Դ�����ѧ����Ϣ/����/����/ѧ��/��ַ
        /*
        * �ü���¼��ѡ�����ѧ��
        * ����һ������,�������ѧ��
        *   ��ʾ��Ϣ
        *   ����¼��ѧ����������Ҫ����Ϣ
        *   ��������,�Ѽ���¼������ݸ�ֵ��ѧ�������Ա����.
        *   ��ѧ��������ӵ�������
        *   ������ӳɹ�����ʾ
        * */
        //�ü���¼��ѡ�����ѧ��
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        // ��ʾ��Ϣ
        System.out.println("������ѧ������");
        //��������,�Ѽ���¼������ݸ�ֵ��ѧ�������Ա����.
        s.setName(sc.nextLine());
        System.out.println("������ѧ��ѧ��");
        s.setId(sc.nextLine());
        System.out.println("������ѧ������");
        s.setAge(sc.nextLine());
        System.out.println("������ѧ����ַ");
        s.setAddress(sc.nextLine());
        //��ѧ��������뼯��
        array.add(s);
        System.out.println("ѧ����Ϣ����ɹ�");

   }
    public static void findAllStudents(ArrayList<Student> array){
        /*
        * 1 �ü���¼��ѡ��鿴����ѧ����Ϣ
        * 2.��һ������,���ڲ忨ѧ����Ϣ
        *       ��ʾ��ͷ��Ϣ
        *       �����������ȥ�����ն�Ӧ��ʽ��ʾѧ����Ϣ,������ʾ����"��".
        * */
        //��鼯���Ƿ�Ϊ��,Ϊ������ʾ������������
        int size = array.size();
        if(size == 0){
            System.out.println("���κ�ѧ����Ϣ,��������ѧ����Ϣ��鿴");
            return;
        }
            //��ʾ��ͷ��Ϣ
        System.out.println("����\tѧ��\t����\t��ַ");

        for (int i = 0; i < size; i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "\t" + s.getId()+ "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> array){
        /*
         *  1 �ü���¼��ѡ��鿴����ѧ����Ϣ
         * 2.��һ������,����ɾ��ѧ����Ϣ
         *  ��ʾ��ʾ��Ϣ
         *  ����¼��Ҫɾ����ѧ��ѧ��
         *  ������Ͻ���Ӧ��ѧ������Ӽ�����ɾ��
         * */
        System.out.println("������Ҫɾ����ѧ��ѧ��:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        //�������Ϊ��,������ʾ��Ϣ
        int size = array.size();
        if(size == 0){
            System.out.println("Ŀǰ���κ�ѧ����Ϣ");
            return;
        }
        //ɾ��ѧ��
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(id.equals(s.getId())){
                array.remove(i);
                System.out.println("ɾ���ɹ�");
            }else {
                System.out.println("�����ѧ������,����������");
            }
        }

    }
    public static void updateStudent(ArrayList<Student> array){
        System.out.println("������Ҫ�޸�ѧ����ѧ��:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(id.equals(s.getId())){
                System.out.println("������ѧ������");
                //��������,�Ѽ���¼������ݸ�ֵ��ѧ�������Ա����.
                s.setName(sc.nextLine());
                System.out.println("������ѧ��ѧ��");
                s.setId(sc.nextLine());
                System.out.println("������ѧ������");
                s.setAge(sc.nextLine());
                System.out.println("������ѧ����ַ");
                s.setAddress(sc.nextLine());
                System.out.println("�޸ĳɹ�");
                return;
            }else {
                System.out.println("�����ѧ������,����������");
            }
        }


    }
}
