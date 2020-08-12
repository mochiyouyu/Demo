package com.cast.day9;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    /*
    Collection接口中定义的方法
    boolean add(E e);向集合中添加元素
    boolean remove(E e);删除集合中的某个元素
    void clear();清空集合中的元素
    boolean contains(E e);判断集合中是否包含某个元素
    boolean isEmpty();判断某个集合是否为空
    int size();获取集合的长度
    Object[] toArray();将集合转换为一个数组
     */
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        System.out.println(coll);
        boolean index = coll.remove("java");
        System.out.println(index);
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        boolean result = coll.contains("hello");
        System.out.println(result);
        boolean result1 = coll.isEmpty();
        System.out.println(result1);
        int size = coll.size();
        System.out.println(size);
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
