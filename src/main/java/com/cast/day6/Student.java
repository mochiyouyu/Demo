package com.cast.day6;

public class Student {
    private String name;

    private int age;

    private final int num;//使用final修饰成员变量，变量不会再有默认值，必须手动赋值或者通过构造方法(包括有参和无参)赋值

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        num = 10;
    }

    public Student() {
        num = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
