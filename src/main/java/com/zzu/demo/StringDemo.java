package com.zzu.demo;

public class StringDemo {

    public static void main(String[] args) {

        char[] helloArray={'r','u','n','o','o','b'};

        String helloString=new String(helloArray);

        System.out.println(helloString);

        String site="www.runoob.com";

        int length=site.length();

        System.out.println(length);

        String str1="我的名字是";

        String str2="runoob";

        System.out.println(str1.concat(str2));
    }
}
