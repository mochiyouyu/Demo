package com.cast.ArrayDemo;

import java.util.ArrayList;

/*
* 注意事项：
* 对于ArrayList集合，直接打印得到的不是地址值，而是内容
* 如果内容是空，得到空括号
* */
/*
基本类型    包装类(引用类型，包装类位于java.lang包下)
byte        Byte
short       Short
int         Integer(特殊)
long        Long
float       Float
double      Double
char        Character(特殊)
boolean     Boolean
 */
public class Demo04ArrayLis {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//泛型只能使用引用类型，不能使用基本类型
        //System.out.println(list);
        list.add("孟浩");
        list.add("孟肖杰");
        list.add("name");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.size());//获得list数组的长度
        System.out.println(list.get(0));//获得下标为0的值
        list.remove(2);//删除下标为2的值，索引从0开始
        System.out.println(list.size());//删除之后的长度

        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(1);
        numList.add(23);
        numList.add(32);
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }
    }
}
