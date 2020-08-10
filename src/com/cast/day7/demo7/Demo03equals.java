package com.cast.day7.demo7;

import java.util.Objects;

public class Demo03equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        String s3 = "aaa";
        String s4 = null;
        boolean b = s1.equals(s2);
        boolean b1 = s2.equals(s3);
        boolean b2 = s1.equals(s4);
//        boolean b3 = s4.equals(s1);  会出现空指针异常java.lang.NullPointerException  因为null是不能调用方法的
        boolean b4 = Objects.equals(s1, s4);
        /*
        Objects类中的equals方法
        public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
         */

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
//        System.out.println(b3);
        System.out.println(b4);
    }
}
