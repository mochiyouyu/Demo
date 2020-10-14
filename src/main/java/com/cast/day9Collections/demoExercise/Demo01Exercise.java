package com.cast.day9Collections.demoExercise;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Exercise {
    public static void main(String[] args) {
        //1.制作一副牌
        ArrayList<String> list1 = new ArrayList<>();//用来存放54张牌
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String number : numbers) {
            for (String color : colors) {
                list1.add(color + number);
            }
        }
        list1.add("大王");
        list1.add("小王");
        //2.洗牌
        Collections.shuffle(list1);
        System.out.println(list1);
        //3.发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            int index = i % 3;
            if (index == 0) {
                player1.add(list1.get(i));
            } else if (index == 1) {
                player2.add(list1.get(i));
            } else if (index == 2) {
                player3.add(list1.get(i));
            }
            if(i>=51)
                diPai.add(list1.get(i));
        }

        System.out.println("底牌是： "+diPai);
        System.out.println("player1的牌是："+player1);
        System.out.println("player2的牌是："+player2);
        System.out.println("player3的牌是："+player3);
    }
}
