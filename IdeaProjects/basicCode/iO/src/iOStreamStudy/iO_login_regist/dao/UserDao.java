package IOStreamStudy.iO_login_regist.dao;
/*
* ��������û����в����Ľӿ�
*
* @author Awei
* @version V1.0
* */

import IOStreamStudy.array_login_regist.pojo.User;

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
