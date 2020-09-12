package com.cast.day10.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/
        /*
        public static <T> boolean addAll(Collection<? super T> c,T... elements)
         */
        Collections.addAll(list, "a", "b", "c", "d", "e", "f");//Collections提供的静态方法，用来增加多个元素
        System.out.println(list);

        /*
        public static void shuffle(List<?> list,
                           Random rnd)
        参数：
            list - 要改组的列表。
            rnd - 用来改组列表的随机源。

         */
        Collections.shuffle(list);
        System.out.println(list);
        Random random = new Random(10);
        Collections.shuffle(list,random);
        System.out.println(list);
    }
}
