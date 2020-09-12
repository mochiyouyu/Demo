package com.cast.day10.hashCodeDemo;

import java.util.HashSet;

/**
 *
 * 哈希值：是一个十进制整数，由系统随机给出（就是一个地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址）
 * 在Object累又有一个方法hashCode()方法有获取哈希值
 * hashCode的方法
 * public native int hashCode();
 * native代表该方法调用的是本地系统的方法
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        int h1 = person1.hashCode();
        System.out.println(h1);
        /*
        toString()方法的内容:
            getClass().getName() + "@" + Integer.toHexString(hashCode())
            Integer.toHexString(hashCode())返回的就是一个哈希值的十六进制的方法
         */
        System.out.println(person1);
        System.out.println(Integer.toHexString(h1));

        System.out.println("------------------");
        /*
        String类重写了toString方法
         */
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        //哈希冲突：两个元素不同，但是哈希值相同
        String str3= "重地";
        String str4= "通话";
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println("---------------");
        String s = "a";
        String s1 = "a";
        String s2 = "重地";
        String s3 = "通话";
        String s4 = "a";
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(s);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        System.out.println(hashSet.size());
        System.out.println(hashSet);
    }
}
