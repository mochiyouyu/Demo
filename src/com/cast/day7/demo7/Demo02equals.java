package com.cast.day7.demo7;

public class Demo02equals {
    /*
    equals 方法在非空对象引用上实现相等关系：

自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true。
对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true。
传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true，那么 x.equals(z) 应返回 true。
一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false，前提是对象上 equals 比较中所用的信息没有被修改。
对于任何非空引用值 x，x.equals(null) 都应返回 false。

     */

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1);
        System.out.println(p2);//没有重写的equals()比较的是对象的地址值
        System.out.println(p1.equals(p2));
    }
}
