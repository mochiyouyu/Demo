package com.cast.day14.objectOutputStream;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private transient int age;//被transient修饰之后不能被序列化和反序列化，静态变量也不能被序列化和反序列化

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
