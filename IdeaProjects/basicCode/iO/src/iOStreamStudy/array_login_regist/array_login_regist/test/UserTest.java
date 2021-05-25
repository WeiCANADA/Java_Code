package IOStreamStudy.array_login_regist.test;

import array_login_regist.dao.UserDao;
import array_login_regist.dao_impl.UserDaoImpl;
import array_login_regist.pojo.User;

import java.util.Random;
import java.util.Scanner;

/**
 * 用户测试类
 *
 * @author Awei
 * @version V1.0
 * 新增加了两个小问题 A:多个对象共享同一个成员变量，用静态
 * B:循环里面如果有switch，并且在switch里面有break，那么结束的不是循环，而是switch语句
 */
public class UserTest {
    public static void main(String[] args) {
        //欢迎界面,给出选择项
        System.out.println("--------------欢迎光临--------------");
        System.out.println("1 登录");
        System.out.println("2 注册");
        System.out.println("3 退出");
        System.out.println("请输入你的选择:");
        // 键盘录入选择，根据选择做不同的操作
        Scanner sc = new Scanner(System.in);
        String choiceString = sc.nextLine();

        // switch语句的多个地方要使用，我就定义到外面
        UserDao userDao = new UserDaoImpl();

        switch (choiceString) {
            case "1":
                // 登录界面，请输入用户名和密码
                System.out.println("--------------登录界面--------------");
                System.out.println("请输入用户名：");
                String username = sc.nextLine();
                System.out.println("请输入密码：");
                String password = sc.nextLine();

                //调用登陆功能
               // UserDao userDao = new UserDaoImpl();
               boolean flag = userDao.isLogin(username, password);
               if(flag){
                   System.out.println("登陆成功");
               }else{
                   System.out.println("用户名或密码错误请重试");
               }
                break;
            case "2":
                //欢迎界面,请输入用户名和密码
                System.out.println("--------------注册界面--------------");
                System.out.println("请输入用户名：");
                String newUserName = sc.nextLine();
                System.out.println("请输入密码：");
                String newPassword = sc.nextLine();

                // 把用户名和密码封装到一个对象中
                User user = new User();
                user.setUsername(newUserName);
                user.setPassword(newPassword);

                // 调用注册功能
                //UserDao userDao = new UserDaoImpl();
                userDao.regist(user);
                System.out.println("注册成功");
                break;
            case "3":
               // System.out.println("谢谢使用,欢迎下次再来");
               // break;
            default:
                System.out.println("谢谢使用,欢迎下次再来");
                System.exit(0);
                break;

        }
    }

}
