package com.cast.day8;

public class Demo06Baozhuang {
    /*
    装箱：把基本数据类型包装到包装类
    拆箱：在包装类当中取出基本类型

    自动装箱与自动拆箱：基本数据类型和包装类之间可以相互转换
    自动装箱：把int类型的整数赋值给包装类
    自动拆箱：Integer时包装类，包装类无法直接参与+、-、*、/的运算，但是它可以自动转换为基本数据类型
     */
    public static void main(String[] args) {

        //装箱
        Integer in1 = new Integer(1);
        System.out.println(in1);//Integer类重写了toString()方法

        Integer in2 = new Integer("1");
        System.out.println(in2);

        Integer in3 = Integer.valueOf(1);//返回一个表示指定的 int 值的 Integer 实例
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");//返回保存指定的 String 的值的 Integer 对象。
        System.out.println(in4);

        /*Integer in5 = Integer.valueOf("a");
        System.out.println(in5);
        NumberFormatException数字格式异常
        */

        System.out.println("===========");
        //拆箱
        int i1 = in1.intValue();
        System.out.println(i1);

        System.out.println("=========");

        Integer in = 1;
        in+=1;
        System.out.println(in);
    }
}
