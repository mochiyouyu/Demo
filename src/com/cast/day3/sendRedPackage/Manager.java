package com.cast.day3.sendRedPackage;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> setOpenWay(OpenMode openWay){
        ArrayList<Integer> list = new ArrayList<>();
        if(openWay instanceof Normal){
            Normal normal=(Normal) openWay;
             list= normal.divide(10,3);
        }else if(openWay instanceof RedRandom){
            RedRandom red=(RedRandom)openWay;
            list=red.divide(10,3);
        }
        return list;
    }

}
