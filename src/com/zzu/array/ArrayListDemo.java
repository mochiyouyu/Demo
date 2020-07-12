package com.zzu.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("!!!");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str:list) {
            System.out.println(str);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for (String str:strArray) {
            System.out.println(str);
        }
        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(strArray[i]);
        }
        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
