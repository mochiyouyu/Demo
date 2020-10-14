package com.cast.day9Collections;

public class Demo04Generic {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.setName("小明");
        System.out.println(generic.getName());
        Genericinterface<String> genericinterface = new GenericinterfaceImpl();
        genericinterface.method("a");
        GenericinterfaceImpl1<Integer> gi1 = new GenericinterfaceImpl1<>();
        gi1.method(12);
        GenericinterfaceImpl1<Double> gi2 = new GenericinterfaceImpl1<>();
        gi2.method(12.21);
        GenericinterfaceImpl1<String> gi3 = new GenericinterfaceImpl1<>();
        gi3.method("hello world java");

    }
}
