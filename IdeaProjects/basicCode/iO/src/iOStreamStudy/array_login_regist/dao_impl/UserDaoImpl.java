package IOStreamStudy.array_login_regist.dao_impl;

import IOStreamStudy.array_login_regist.dao.UserDao;
import IOStreamStudy.array_login_regist.pojo.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    //Ϊ���ö�������ܹ�ʹ��ͬһ�����,�ͰѼ��϶���Ϊ��Ա����
    //private ArrayList<User> array = new ArrayList<User>();
    //Ϊ���öԸ�������ͬһ����Ա����,��static
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;
        for (User user : array) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {
        array.add(user);

    }
}
