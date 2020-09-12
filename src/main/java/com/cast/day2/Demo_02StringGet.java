package com.cast.day2;

/*
public int length();获取字符串的字符个数，得到字符串的长度
public String concat(String str);将当前字符串与参数字符串拼接在一起 并返回拼接后的字符串
public char charAt(int index);获取指定索引位置的单个字符
public int indexOf(String str);查找参数字符串在本字符串当中首次出现的索引值，如果没有返回-1值
public String subString(int begin,int end);begin开始，end结束，不包括end
public String subString(int index);截取index开始 ，一直到字符串结尾的字符串
 */
public class Demo_02StringGet {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrst";
        int length=str.length();//获取字符串的长度
        System.out.println(length);
        String concatStr="uvwxyz";
        System.out.println(str.concat(concatStr));//拼接字符串
        System.out.println(str.charAt(12));//获取指定索引值的单个字符串
        System.out.println(str.indexOf("kl"));//查找参数字符串在本字符串当中首次出现的索引值，如果没有返回-1值
        System.out.println(str.indexOf("z"));
        System.out.println(str.substring(0,10));//截取0开始，9结束的中间字符串
        System.out.println(str.substring(10));//从索引值为10，一直到字符串结束
    }
}
