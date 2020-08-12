package com.cast.day9;

public class GenericinterfaceImpl implements Genericinterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
