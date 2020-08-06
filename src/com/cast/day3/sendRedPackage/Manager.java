package com.cast.day3.sendRedPackage;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> redAvg(double totalMoney, int count) {
        ArrayList<Double> redList = new ArrayList<>();
        double money = super.getMoney();
        if (money >= totalMoney) {
            double moneyAvg = totalMoney / count;
            for (int i = 0; i < count; i++) {
                redList.add(moneyAvg);
            }
            super.setMoney(money - totalMoney);
        } else {
            System.out.println("余额不足");
        }
        return redList;
    }

    public ArrayList<Double> redRandom(double totalMoney, int count) {
        ArrayList<Double> redList = new ArrayList<>();
        double money = super.getMoney();
        if (money < totalMoney) {
            System.out.println("余额不足");
        } else {
            for (int i = 0; i < count; i++) {
                double perRedPackage = 0.0;
                while (redList.size() <= count) {
                    double sum = 0.0;
                    for (int i1 = 0; i1 < redList.size(); i1++) {
                        sum = sum + redList.get(i1);
                    }
                    perRedPackage = Double.parseDouble(new Formatter().format("%.2f", Math.random() * (totalMoney-sum)).toString());
                    if(sum<totalMoney - redList.size() * 0.01){
                        redList.add(perRedPackage);
                    }
                    if(redList.size()==count-1){
                        redList.add(totalMoney-sum);
                        break;
                    }
                    if (sum >= totalMoney - redList.size() * 0.01) {
                        redList.add(0.01);
                        break;
                    }
                }
            }
            super.setMoney(money - totalMoney);
        }
        return redList;
    }


}
