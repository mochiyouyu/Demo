package com.cast.day5.laptop;

public class ComputerTest {
    public static void main(String[] args) {
        Laptop computer = new Laptop();
        computer.powerOn();
        Mouse mouse = new Mouse();
//        USB usb=mouse;//向上转型
        //USB usb = new Mouse();
        computer.useDevice(mouse);//会自动进行 类型转换
        USB usb1 = new Keyboard();
        computer.useDevice(usb1);
        computer.powerOff();
        System.out.println("================");
        method(10);
        method(10.0);
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
