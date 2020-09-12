package com.cast.day3;

public class Demo_03this {
    /*
    super用于访问父类的内，而 this关键字用来访问本类的内容
    1.在本类的成员方法中，访问本类的本类的成员变量
    2.在本类的成员方法中，访问本类的另一个的成员方法
    3.在本类的构造方法中，访问本类的另一个构造方法
    this在调用本类的构造方法时，也必须是本类的第一个语句。
     */
    //java是单继承的，多级继承
    int num=10;
    public Demo_03this(){
        this(12);
    }
    public Demo_03this(int num){
        this.num=num;
    }
    public void showMessage(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
    }
    public void methodA(){
        this.showMessage();
    }
    public static void main(String[] args) {
        Demo_03this thisA=new Demo_03this();
        thisA.methodA();
    }
}
