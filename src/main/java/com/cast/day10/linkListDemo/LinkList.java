package com.cast.day10.linkListDemo;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        linked.addFirst("qaq");//把元素增加到列表第一个位置
        System.out.println(linked);
        linked.addLast(".com");//把元素增加到链表末尾
        System.out.println(linked);

        if(!linked.isEmpty()){
            String first = linked.getFirst();//获取链表第一个元素
            System.out.println(first);
            String last = linked.getLast();//获取列表最后一个元素
            System.out.println(last);
        }

        System.out.println("--------------");

        String first = linked.removeFirst();
        System.out.println(first);

        String last = linked.removeLast();
        System.out.println(last);

        System.out.println(linked);

        String str = linked.remove();//从第一个元素开始删除
        System.out.println(str);

        linked.clear();//清空链表集合所有元素
//        System.out.println(linked.getFirst());//获取集合的元素会报NoSuchElementException异常
    }
}
