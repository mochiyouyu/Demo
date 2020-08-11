package com.cast.day8;

public class Demo07StringToInteger {
    /*
    基本数据类型-->字符串类型
    1.在数据后面直接+"";
    2.用toString();方法
    3.使用Integer包装类中的ValueOf()方法

    字符串-->基本类型
    int i = Integer.parseInt(String str);
    */
    public static void main(String[] args) {
        Integer a=100;
        String str = a+"";
        String str1 = a.toString();
        String str2 = String.valueOf(a);
        System.out.println(str + 200+" "+ str1 +200+ " "+ str2+200);

        String str3 = "1";
        int a1 = Integer.parseInt(str3);
        System.out.println(a1);
    }
}
