package com.cast.day10.map;

import java.util.*;

public class HashMapDemo {
    /**
     * HashMap<>的键和值都可以为空,HashTable<>的键和值都不能为空(不然会报空指针异常)
     */
    public static void main(String[] args) {
        /*show01();*/
        /*show02();*/
        show03();
    }

    private static void show03() {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//无序的
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","a");
        linkedHashMap.put("c","c");
        linkedHashMap.put("b","b");
        linkedHashMap.put("a","d");
        System.out.println(linkedHashMap);//有序的
    }

    private static void show02() {
        Map<String,Person> map = new HashMap<>();
        Person p1 = new Person("张三",12);
        Person p2 = new Person("李四",19);
        Person p3 = new Person("王五",20);
        map.put("上海",p1);
        map.put("北京",p2);
        map.put("广州",p3);
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s).getName()+":"+map.get(s).getAge());
        }

        System.out.println("-----------------");
        Map<Person,String> map1 = new HashMap<>();
        map1.put(p1,"上海");
        map1.put(p2,"北京");
        map1.put(p3,"广州");
        System.out.println(map1);
        Set<Map.Entry<Person, String>> entries = map1.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey().getName()+":"+entry.getKey().getAge()+":"+entry.getValue());
        }

    }

    private static void show01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("小明",18);
        Integer integer = map.put("小明",20);
        map.put("马东阳",20);
        map.put("小李",19);
        System.out.println(integer);
        System.out.println(map);

        /*
        public V remove(Object obj);
        key存在，返回v.
        key不存在，返回null;
         */
        Integer integer1 = map.remove("马东阳");//int i = map.remove("马东阳");自动拆箱，不存在会出现异常
        System.out.println(integer1);
        Integer integer2 = map.remove("马东阳");
        System.out.println(integer2);
        System.out.println(map);
        Integer integer3 = map.get("小李");
        System.out.println(integer3);
        System.out.println(map.get("马东阳"));//key不存在返回null
        System.out.println(map.containsKey("马东阳"));//判断key是否存在
        System.out.println("-----------------");
        System.out.println(map);
        Set<String> strings = map.keySet();
        Iterator<String> str = strings.iterator();
        while(str.hasNext()){
            String key = str.next();
            System.out.println(key + " "+map.get(key));
        }

        System.out.println("---------------");
        for (String key : strings) {
            System.out.println(key + ":"+map.get(key));
        }

        System.out.println("--------------");

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
