package com.cast.day6.demo02;

public class Body {
    private String name;

    public class Heart {
        public void beat() {
            System.out.println("心脏跳动");
        }
    }

    public void move() {
        System.out.println("身体移动");
        Heart heart=new Heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
