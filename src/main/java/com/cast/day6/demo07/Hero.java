package com.cast.day6.demo07;

public class Hero {
    private String name;

    private Skill skill;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("英雄"+name+"开始施放技能");
        skill.useSkill();
        System.out.println("施放技能完成");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
