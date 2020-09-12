package com.cast.day10.linkedHashSetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    /**
     *LinkedHashSet的结构是：哈希表(数组+链表/红黑树)+链表；多了一条链表记录元素的顺序，保证元素有序
     */
    public static void main(String[] args) {
        String str1= "abc";
        String str2 = "abc";
        String str3 ="小明";
        String str4 = "重地";
        String str5 = "通话";
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add(str1);
        linked.add(str2);
        linked.add(str3);
        linked.add(str4);
        linked.add(str5);
        System.out.println(linked);
    }
}
