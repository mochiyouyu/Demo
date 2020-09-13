package com.cast.day11.exception;

import java.util.Objects;

/*
throw关键字
作用：
    可以使用throw关键字在指定的方法中抛出异常
    使用格式：
        throw new XXXException("异常产生的原因");
       注意：
       1.throw关键字必须写在方法的内部。
       2.throw关键字new的对象必须是Exception或者是Exception对象的子类
       3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字创建的是RunTimeException或者是RunTimeException的子类对象，我们可以不处理，默认交给JVM处理（打印异常，中断程序）
            throw关键字后边创建的是编译异常(写代码的时候报错)，我们就必须处理这个异常对象，要么throws、要么try...catch
 */
public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = null;
        int index = test(arr,3);
        System.out.println(index);
    }

    private static int test(int[] arr , int index) {
        /*
        public static <T> T requireNonNull(T obj, String message) {
        if (obj == null)
            throw new NullPointerException(message);
        return obj;
    }
         */
        /*if (arr ==null)
        throw new NullPointerException("传入的数组不能为空");*/
        Objects.requireNonNull(arr,"传入的数组不能为空");
        if(index<0||index>arr.length-1)
            throw new ArrayIndexOutOfBoundsException("传入的索引超出数组的使用范围");
        int result = arr[index];
        return result;
    }
}
