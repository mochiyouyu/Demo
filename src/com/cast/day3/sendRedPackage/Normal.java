package com.cast.day3.sendRedPackage;

import java.util.ArrayList;

public class Normal extends Manager implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int money = super.getMoney();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        super.setMoney(money - totalMoney);
        return list;
    }
}
