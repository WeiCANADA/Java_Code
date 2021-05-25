package classString.example;

import java.util.Scanner;

public class ExmapleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "liusitan";
        String password = "LST123";
        String inputName = sc.nextLine();
        String inputNPassword = sc.nextLine();
        if(name.equals(inputName) && password.equals(inputNPassword)){
            System.out.println("µÇÂ½³É¹¦");
        }
        /*char[] exitName = name.toCharArray();
        char[] exitPassword = password.toCharArray();
        for (int i = 0; i <3 ; i++) {
            char[] inputName =login.inputName();
            char[] inputpassword =login.inputPassWord();
            Boolean a =login.compare(exitName,inputName);
            Boolean b =login.compare(exitPassword,inputpassword);
            if(a == true && b == true){
                System.out.println("µÇÂ½³É¹¦");
                break;
            }else{
                System.out.println("µÇÂ½ÕËºÅ»òÃÜÂë´íÎóÇëÖØÊÔ");
            }
        }
*/
    }
}
