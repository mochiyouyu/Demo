package com.cast.day9;

public class GenericinterfaceImpl1<E> implements Genericinterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
