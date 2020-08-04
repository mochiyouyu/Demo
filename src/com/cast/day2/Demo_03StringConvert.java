package com.cast.day2;

public class Demo_03StringConvert {
    public static void main(String[] args) {
        String str="Hello";
        char[] chars=str.toCharArray();//将字符串拆分成字符数组并返回
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
        byte[] bytes=str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
        String str1="What do you do?";
        String str2=str1.replace("o", "*");//字符串的替换方法
        System.out.println(str1);
        System.out.println(str2);
    }
}
