package com.cast.day2;

import java.util.Arrays;
//Arrays.sort()
/*
如果是数值，按照从小到大
如果是字符串。按照字母升序
如果是汉字，按照对应的值升序
如果是自定义的类，则必须有Comparable或Comparator接口的支持
 */
public class Demo07_Arrays {
    public static void main(String[] args) {
        int[] numArray={1,2,3};
        String str= Arrays.toString(numArray);//将int[]数组按照默认格式转换成字符串
        System.out.println(str);
        int[] array={12,32,1,43,33};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        String strs="sadjgbaig328545";
        char[] chars=strs.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
