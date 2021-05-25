package redpackagePractice;

import java.util.ArrayList;

public class Manager extends Person {
    public Manager() {

    }
    public Manager(String name, int balance){
        super(name, balance);
    }
    public void show(){
        System.out.println("管理员姓名" + getName() + "余额" + getBalance());
    }


    public ArrayList<Integer> send(int sentMoney , int b){

        ArrayList<Integer> redList = new ArrayList<>();
        if(sentMoney <= super.getBalance() ){
            int c = sentMoney / b;
            int d = sentMoney % b;
            for (int i = 0; i < b - 1 ; i++) {
                redList.add(c);
            }
                redList.add(c + d);
                super.setBalance(super.getBalance() - sentMoney);
                return redList;
            }else{
            return redList;
        }

        }
    }

