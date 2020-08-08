package com.cast.day5.laptop;

public class Laptop{

    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    //笔记本通过USB接口使用USB设备
    public void useDevice(USB usb){
        usb.open();//打开接口
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if(usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard) usb;
            keyboard.type();
        }
        usb.close();//关闭接口
    }
}
