package com.cast.day6.demo06;

public class Demo01Main {
    //一个类作为成员变量
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);
        hero.setWeapon(new Weapon("多兰剑"));
        hero.attack();
    }
}
