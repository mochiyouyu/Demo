package com.cast.day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    /*
    迭代器的使用：
    1.使用集合中的iterator()方法获取迭代类的实现类对象，使用Iterator接口接收(多态)；
    2.使用Iterator接口中的hasNext()方法判断是否还有元素
    3.使用Iterator接口中的next()取出集合的下一个元素
     */
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        //多态    接口                 实现类对象
        Iterator<String> iterator = coll.iterator();
        //while循环实现迭代器的循环
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("================");

        //for循环实现
        for(Iterator<String> it = coll.iterator(); it.hasNext();){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("==============");

        //使用foreach增强循环遍历，目标只能是集合或者数组
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
