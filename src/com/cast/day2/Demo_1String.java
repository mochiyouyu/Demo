package com.cast.day2;

/*
三种构造方法
1.public String(); 创建一个空字符串
2.public String(char[] array);根据字符数组内容来创建字符串
3.public String(byte[] array);根据字节数组的内容来创建字符串

字符串常量池,程序当中直接写上的双引号字符串，就在字符串常量池中

对于基本类型来说，==是【数值】的比较
对于引用类型来说，==是【地址值】的比较
 */
public class Demo_1String {
    public static void main(String[] args) {
        String str = new String();
        System.out.println(str);
        char[] chars = {'A', 'B', 'C'};
        String str2 = new String(chars);
        System.out.println(str2);
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println(str3);
        String str1 = "abc";
        String str4 = "abc";
        System.out.println(str1 == str4);
        System.out.println(str1 == str2);
        System.out.println(str2 == str4);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));//equals()用于比较字符串的内容
        String str5=null;
//        System.out.println(str5.equals("abc")); 不推荐，报错，会产生空指针异常NullPointerException
        System.out.println("abc".equals(str5));//推荐
        System.out.println("=============");
        String strA="Java";
        String strB="java";
        System.out.println(strA.equals(strB));//严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写,只有英文字母不区分大小写
    }
}
