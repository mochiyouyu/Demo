package com.cast.day10.exercise;

import java.util.*;

public class Game2PuKe {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "♥", "♠", "♦", "♣");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        ArrayList<String> list3 = new ArrayList<>();
        for (String str1 : list2) {
            for (String str2 : list1) {
                list3.add(str2 + str1);
            }
        }
        Collections.addAll(list3, "大王", "小王");
        System.out.println(list3.size());
        Map<Integer, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 53; i++) {
            list.add(i);
        }
        for (Integer integer : list) {
            map.put(integer, list3.get(integer));
        }
        //洗牌
        Collections.shuffle(list);
        //发牌，拿到牌的索引
        List<Integer> list4 = new ArrayList<>();//选手A夺得手牌索引
        List<Integer> list5 = new ArrayList<>();//选手B夺得手牌索引
        List<Integer> list6 = new ArrayList<>();//选手C夺得手牌索引
        List<Integer> list7 = new ArrayList<>();//底牌索引
        //发牌
        for (int i = 0; i < list.size(); i++) {
            if (i > 50) {
                list7.add(list.get(i));//拿出底牌
            }
            if (i % 3 == 0 && i <= 50) {
                list4.add(list.get(i));
            }
            if (i % 3 == 1 && i <= 50) {
                list5.add(list.get(i));
            }
            if (i % 3 == 2 && i <= 50) {
                list6.add(list.get(i));
            }
        }
        System.out.println("选手A的牌索引" + ":" + list4);
        System.out.println("选手B的牌索引" + ":" + list5);
        System.out.println("选手C的牌索引" + ":" + list6);
        System.out.println("底牌索引" + ":" + list7);
        //整理后的牌索引
        Collections.sort(list4);
        Collections.sort(list5);
        Collections.sort(list6);
        Collections.sort(list7);
        System.out.println("选手A的牌索引" + ":" + list4);
        System.out.println("选手B的牌索引" + ":" + list5);
        System.out.println("选手C的牌索引" + ":" + list6);
        System.out.println("底牌索引" + ":" + list7);

        //查看牌
        System.out.println("----------------");
        lookPai("A", list4, map);
        lookPai("B", list5, map);
        lookPai("C", list6, map);
        lookPai("DiPai", list7, map);
    }

    public static void lookPai(String name, List<Integer> list, Map<Integer, String> map) {
        ArrayList<String> list1 = new ArrayList<>();
        for (Integer i : list) {
            list1.add(map.get(i));
        }
        System.out.println("选手" + name + "的牌" + ":" + list1);
    }
}
