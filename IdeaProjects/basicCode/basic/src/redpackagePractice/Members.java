package redpackagePractice;

import java.util.ArrayList;
import java.util.Random;

public class Members extends Person {
    public Members() {
    }

    public Members(String name, int balance) {
        super(name, balance);
    }
    public void show(){
        System.out.println("成员姓名" + getName() + "成员余额" + getBalance());
    }
    public void receive(ArrayList<Integer> list){
       Random random = new Random();
       int index = random.nextInt(list.size());
       int a = list.remove(index);
       super.setBalance(super.getBalance() + a );
    }
}