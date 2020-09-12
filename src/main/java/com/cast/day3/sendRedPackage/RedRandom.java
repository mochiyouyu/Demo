package com.cast.day3.sendRedPackage;

import java.util.ArrayList;
import java.util.Random;

public class RedRandom extends Manager implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int moneyA = super.getMoney();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney);
        super.setMoney(moneyA - totalMoney);
        return list;
    }
}
