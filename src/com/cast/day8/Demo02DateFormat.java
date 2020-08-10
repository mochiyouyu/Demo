package com.cast.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(text);
    }
}
