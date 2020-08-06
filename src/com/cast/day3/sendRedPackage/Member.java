package com.cast.day3.sendRedPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, double money) {
        super(name, money);
    }

    public void receive(ArrayList<Double> redList){
        int index=new Random().nextInt(redList.size());
        double x=redList.remove(index);
        double money=super.getMoney();
        super.setMoney(money+x);
    }
}
