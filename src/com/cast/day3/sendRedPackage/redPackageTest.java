package com.cast.day3.sendRedPackage;

import java.util.ArrayList;

public class redPackageTest {
    public static void main(String[] args) {
        Manager manager = new Manager("manager", 100);
        Member one = new Member("one", 0);
        Member two = new Member("two", 0);
        Member three = new Member("three", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============");
        ArrayList<Double> redList1 = manager.redRandom(21,3);
        for (int i = 0; i < redList1.size(); i++) {
            System.out.print(redList1.get(i)+" ");
        }
        one.receive(redList1);
        two.receive(redList1);
        three.receive(redList1);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=================");
        ArrayList<Double> redList = manager.redAvg(21, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
