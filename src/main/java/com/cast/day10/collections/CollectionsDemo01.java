package com.cast.day10.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2,6,5,4,12,8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);//默认是升序

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","c","b");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);//按照a,b,c,d的顺序是升序排列

        ArrayList<Person> list2 = new ArrayList<>();
        Person p1 = new Person("张三",15);
        Person p2 = new Person("李四",20);
        Person p3 = new Person("王五",18);
        Collections.addAll(list2,p1,p2,p3);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        System.out.println("----------------------------");
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3,1,3,2);
        System.out.println(list3);
        Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序
                //return o2- o1降序
            }
        });
        System.out.println(list3);

        Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
            }
        });
        System.out.println(list3);

        System.out.println("---------------------");

        ArrayList<Person> people = new ArrayList<>();
        Collections.addAll(people,p1,p2,p3);
        System.out.println(people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();//升序
            }
        });
        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();//降序
            }
        });
        System.out.println(people);
    }
}
