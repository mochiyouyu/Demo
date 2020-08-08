package com.cast.day5;

public class Demo_01Multi {
    /*
    代码当中体现多态，就是父类引用指向子类对象。
    格式：
    父类名称 对象名 = new 子类名称();
    或者
    接口名称 对象名 = new 实现类名称();

    直接通过对象名访问成员变量，看等号左边是谁，优先用谁，没有则向上找
    访问成员方法，看右侧是谁，优先用谁，
    向上转型的格式就是多态的写法：
    父类 对象名 = new 子类();
    向上转型是安全的。

    对象的向下转型，其实是一个还原的动作，
    格式：
    子类 对象名 = (子类)父类对象;

     */
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();
        zi.methodA();
        //左侧父类引用指向右侧子类对象，这就是引用
        Fu obj=new Zi();//向上转型
        obj.method();
        obj.methodA();
        System.out.println("=================");
        System.out.println(obj.num);
        obj.showNum();
        System.out.println("===============");
        Zi  z =(Zi) obj;
        z.methodA();

        System.out.println("====================");

        Animal animal=new Cat();//向上转型不能访问子类特有的方法
        animal.eat();
//        Cat cat=(Cat)animal;
//        cat.catchMouse();
//        cat.eat();

//        Dog dog=(Dog)animal;
//        dog.eat();
//        dog.watchHouse();
        //转型失败，把父类向下转型为原本的子类

        //instanceof 可以用来进行类型判断
        if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.catchMouse();
            cat.eat();
        }else if(animal instanceof Dog){
            Dog dog=(Dog)animal;
            dog.eat();
            dog.watchHouse();
        }
        System.out.println("===================");
        Animal animal1=new Dog();
        animal1.eat();
        if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.catchMouse();
            cat.eat();
        }else if(animal instanceof Dog){
            Dog dog=(Dog)animal;
            dog.eat();
            dog.watchHouse();
        }
    }
}
