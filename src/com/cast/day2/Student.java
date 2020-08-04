package com.cast.day2;

public class Student {
    private String name;

    private int age;

    static String room;

    private static int stuId = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.stuId = ++stuId;
    }

    public Student() {
        stuId++;
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

    public static int getStuId() {
        return stuId;
    }

    public static void setStuId(int stuId) {
        Student.stuId = stuId;
    }
}
