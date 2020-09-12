package com.cast.day6.demo07;

public class Demo01 {
    //接口作为成员变量
    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("韩信");
        hero.setSkill(new SkillImpl());
//        hero.setSkill(new Skill() {
//            @Override
//            public void useSkill() {
//                System.out.println("致命一击");
//            }
//        });
        hero.attack();
    }
}
