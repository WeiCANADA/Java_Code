package array_login_regist.dao;

import array_login_regist.pojo.User;

/*
* ��������û����в����Ľӿ�
*
* @author Awei
* @version V1.0
* */
public  interface UserDao {
    /*
    * �����û���¼����
    * @param username
    * @param password
    * @return ���ص�½�Ƿ�ɹ�
    *
    * */
    public abstract boolean isLogin (String username, String password);

   /*
   * ��������ע����Ϣ
   * @param user Ҫע�����Ϣ
   * */
    public abstract void regist(User user);
}
