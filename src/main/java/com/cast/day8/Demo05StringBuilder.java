package com.cast.day8;

public class Demo05StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println(bu2);
        bu1.append("abc");
        System.out.println(bu1);
        bu2.append("efg");
        System.out.println(bu2);
        /*
        链式编程
         */
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append("World").append("java");
        System.out.println(sb);
        sb.reverse();//将缓冲区里面的内容反转
        System.out.println(sb);
        System.out.println(sb instanceof StringBuilder);
        System.out.println(sb.toString() instanceof String);//toString()方法，这里是将StringBuilder类型转换为String类型

    }
}
