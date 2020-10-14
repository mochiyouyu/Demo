package com.cast.day9Collections;

import java.util.ArrayList;

public class Demo05GenericTongPeiFu {
    /*
    <? extends E>泛型的上限限定：代表使用的泛型只能是E类型的子类或其本身
    <? super E>泛型的下限限定 ： 代表使用的泛型只能是E类型的父类或其本身
     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        printArray1(list1);
        /*printArray1(list2);*///报错
        printArray1(list3);
        /*printArray1(list4);*///报错

        System.out.println("=============");

        /*printArray2(list1);*///报错
        /*printArray2(list2);*///报错
        printArray2(list3);
        printArray2(list4);
    }
    public static void printArray1(ArrayList<? extends Number> list){
        System.out.println(list);
    }
    public static void printArray2(ArrayList<? super Number> list){
        System.out.println(list);
    }
}
