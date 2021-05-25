package array_login_regist.dao_impl;


import array_login_regist.pojo.User;

import java.util.ArrayList;

public class UserDaoImpl implements array_login_regist.dao.UserDao {
    //为了让多个方法能够使用同一个结合,就把集合定义为成员变量
    private ArrayList<User> array = new ArrayList<User>();

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
