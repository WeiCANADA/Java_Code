package IOStreamStudy.array_login_regist.test;

import array_login_regist.dao.UserDao;
import array_login_regist.dao_impl.UserDaoImpl;
import array_login_regist.pojo.User;

import java.util.Random;
import java.util.Scanner;

/**
 * �û�������
 *
 * @author Awei
 * @version V1.0
 * ������������С���� A:���������ͬһ����Ա�������þ�̬
 * B:ѭ�����������switch��������switch������break����ô�����Ĳ���ѭ��������switch���
 */
public class UserTest {
    public static void main(String[] args) {
        //��ӭ����,����ѡ����
        System.out.println("--------------��ӭ����--------------");
        System.out.println("1 ��¼");
        System.out.println("2 ע��");
        System.out.println("3 �˳�");
        System.out.println("���������ѡ��:");
        // ����¼��ѡ�񣬸���ѡ������ͬ�Ĳ���
        Scanner sc = new Scanner(System.in);
        String choiceString = sc.nextLine();

        // switch���Ķ���ط�Ҫʹ�ã��ҾͶ��嵽����
        UserDao userDao = new UserDaoImpl();

        switch (choiceString) {
            case "1":
                // ��¼���棬�������û���������
                System.out.println("--------------��¼����--------------");
                System.out.println("�������û�����");
                String username = sc.nextLine();
                System.out.println("���������룺");
                String password = sc.nextLine();

                //���õ�½����
               // UserDao userDao = new UserDaoImpl();
               boolean flag = userDao.isLogin(username, password);
               if(flag){
                   System.out.println("��½�ɹ�");
               }else{
                   System.out.println("�û������������������");
               }
                break;
            case "2":
                //��ӭ����,�������û���������
                System.out.println("--------------ע�����--------------");
                System.out.println("�������û�����");
                String newUserName = sc.nextLine();
                System.out.println("���������룺");
                String newPassword = sc.nextLine();

                // ���û����������װ��һ��������
                User user = new User();
                user.setUsername(newUserName);
                user.setPassword(newPassword);

                // ����ע�Ṧ��
                //UserDao userDao = new UserDaoImpl();
                userDao.regist(user);
                System.out.println("ע��ɹ�");
                break;
            case "3":
               // System.out.println("ллʹ��,��ӭ�´�����");
               // break;
            default:
                System.out.println("ллʹ��,��ӭ�´�����");
                System.exit(0);
                break;

        }
    }

}
