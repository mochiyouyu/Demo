package com.cast.day11.exception;

public class FuException {
    public void show01() throws NullPointerException, ClassCastException {
    }

    public void show02() throws IndexOutOfBoundsException {
    }

    public void show03() throws Exception {
    }

    public void show04() {
    }
}

class ZiException extends FuException {
    @Override//子类重写父类方法时，可以抛出和父类相同的异常
    public void show01() throws NullPointerException, ClassCastException {
    }

    @Override//子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException {
    }

    @Override//子类重写父类方法时，可以不抛出异常
    public void show03() {
    }

    @Override//父类不抛出异常，子类也不能抛出异常，若子类出现异常，则用try...catch处理
    public void show04() throws NullPointerException{
    }
}
