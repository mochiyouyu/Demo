package com.cast.day9Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTongpeiFu {
    /*
    泛型通配符：
    ?:代表任意的数据类型
    使用方法：
    不能创建对象使用，
    只能作为方法的参数使用
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        printArray(list1);
        printArray(list2);
    }

    private static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
