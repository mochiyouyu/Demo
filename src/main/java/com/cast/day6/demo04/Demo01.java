package com.cast.day6.demo04;

public class Demo01 {
    public static void main(String[] args) {
        /*
        匿名内部类的定义格式：
        接口名称 对象名 = new 接口名称(){
        //覆盖重写接口里面的抽象方法
        };
       1. 匿名内部类在创建对象的时候只能使用一次，
        如果希望多次创建对象，而且类的内容一样的话，必须使用单独的实现类

       2. 匿名对象在调用方法时，只能调用一次，
        如果要多次调用必须创建有名称的对象，因为匿名对象类不能调用第二次方法
       3. 匿名内部类是省略的实现类或者子类，而匿名对象是省略了对象名称，不是同一回事
         */
        Myinterface myinterface=new Myinterface() {
            @Override
            public void printMethod() {
                System.out.println("局部匿名内部类实现了方法");
            }
        };
        myinterface.printMethod();

        System.out.println("==================");

        new Myinterface(){
            @Override
            public void printMethod() {
                System.out.println("局部匿名内部类创建匿名对象并调用方法");
            }
        }.printMethod();
    }
}
