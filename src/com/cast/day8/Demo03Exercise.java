package com.cast.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03Exercise {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf.parse("2000-03-29");
        long l = date1.getTime() - date2.getTime();
        long d = l / (24*60*60*1000);
        System.out.println(d+ "天");
    }
}
