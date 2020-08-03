package com.cast.demo;

public class Demo_03Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        Person person1=new Person("name1",12);
        Person person2=new Person("name2",14);
        Person person3=new Person("name3",13);
        array[0]=person1;
        array[1]=person2;
        array[2]=person3;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[2].getName());
    }
}
