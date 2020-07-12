package com.zzu.demo;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("菜鸟教程官网是：");

        sb.append("www.");

        sb.append("runoob.");

        sb.append("com");

        System.out.print(sb);

        System.out.println();

        sb.reverse();

        System.out.print(sb);
    }
}
