package com.cast.day3.sendRedPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> redList){
        int index=new Random().nextInt(redList.size());
        int x=redList.remove(index);
        int money=super.getMoney();
        super.setMoney(money+x);
    }
}
