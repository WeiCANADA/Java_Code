package redpackagePractice;

import java.util.ArrayList;

public class MainRedList {
    public static void main(String[] args) {
        Manager manager = new Manager("群主张一",100);


        Members  one = new Members("张二",0);
        Members  two = new Members("张三",0);
        Members  three = new Members("张四",0);
        manager.show();
        one.show();
        two.show();
        three.show();

        ArrayList<Integer> redList = manager.send(20,3);

        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();



    }
}
