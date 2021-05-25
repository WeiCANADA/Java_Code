package array_login_regist.dao;

import array_login_regist.pojo.User;

/*
* 这是针对用户进行操作的接口
*
* @author Awei
* @version V1.0
* */
public  interface UserDao {
    /*
    * 这是用户登录功能
    * @param username
    * @param password
    * @return 返回登陆是否成功
    *
    * */
    public abstract boolean isLogin (String username, String password);

   /*
   * 这是用于注册信息
   * @param user 要注册的信息
   * */
    public abstract void regist(User user);
}
