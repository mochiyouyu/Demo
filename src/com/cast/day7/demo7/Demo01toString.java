package com.cast.day7.demo7;

import java.util.Random;
import java.util.Scanner;

public class Demo01toString {
    /*
    java.lang.Object;
    类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。
    返回该对象的字符串表示。通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。结果应是一个简明但易于读懂的信息表达式。建议所有子类都重写此方法。
Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的无符号十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于：

getClass().getName() + '@' + Integer.toHexString(hashCode())
返回该对象的地址值
     */
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        String str = person.toString();
        System.out.println(str);
        //判断一个类是否重写了toString()方法,直接用对象名.toString()打印即可没有重写，打印出来的是对象的地址值
        Random r = new Random();
        System.out.println(r);//没有重写

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//重写了toString()方法
    }
}
