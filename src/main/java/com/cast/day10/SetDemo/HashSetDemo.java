package com.cast.day10.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        //使用迭代器遍历Set
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //使用增强for循环遍历Set
        System.out.println("---------------");
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        System.out.println("------------------------");
        /*
        自定义类型使用HashSet必须重写hashCode()方法和equals()方法
         */
        Person p1 = new Person("马东阳",18);
        Person p2 = new Person("马东阳",18);
        Person p3 = new Person("马东阳",20);
        Person p4 = new Person("小明",18);

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        System.out.println(hashSet);
    }
}
