package com.cast.day2;

public class Demo_04StringSplit {
    /*
    字符串的分割方法
    public String[] split(String regex);按照参数规则，把字符串分割成若干部分
    split()方法的参数实际上是一个正则表达式，
    如果要切英文".",则可以写为"\\."
    */
    public static void main(String[] args) {
        String str="Hello,World";
        String[] array1=str.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String str1="XXX.YYY.ZZZ";
        String[] array2=str1.split("\\.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
