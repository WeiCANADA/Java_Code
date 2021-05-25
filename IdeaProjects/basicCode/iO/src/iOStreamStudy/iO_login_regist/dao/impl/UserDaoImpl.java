package IOStreamStudy.iO_login_regist.dao.impl;
/*
 * 这是用户操作的具体实现类(IO版)
 *
 * @author Awei
 * @version V1.1
* */
import IOStreamStudy.array_login_regist.dao.UserDao;
import IOStreamStudy.array_login_regist.pojo.User;

import java.io.*;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {

    }

    @Override
    public boolean isLogin(String username, String password) {
       boolean flag = false;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("user.txt"));
            String line = null;
            while ( (line = br.readLine()) != null){
             String[] dates = line.split("=");
             if(dates[0].equals(username) && dates[1].equals(password)){
                 flag = true;
                 break;//当找到匹配资源时候,退出循环!
             }else {
                 System.out.println("输入的用户名或密码错误,请重试!");
             }
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在!");
            //e.printStackTrace();
        } catch (IOException e) {

           // e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("释放资源失败!");
                    //e.printStackTrace();
                }
            }
        }

        return flag;
    }

    @Override
    public void regist(User user) {
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter("user.txt"));
            //为了让注册的数据能够有一定的规则，定义了一个规则： 用户名=密码
            br.write(user.getUsername() + "=" + user.getPassword());
            br.newLine();
            br.flush();

        } catch (IOException e) {
            System.out.println("用户注册失败,请重试!");
            //e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("释放资源失败!");
                //e.printStackTrace();
            }
        }
    }
}
