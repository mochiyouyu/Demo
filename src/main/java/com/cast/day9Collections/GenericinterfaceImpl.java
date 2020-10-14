package com.cast.day9Collections;

public class GenericinterfaceImpl implements Genericinterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
