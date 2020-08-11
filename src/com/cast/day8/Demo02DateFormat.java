package com.cast.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
public Date parse(String text,
                  ParsePosition pos)解析字符串的文本，生成 Date。
 */
public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(text);
        Date date1 = sdf.parse("2020年08月11日  11时53分25秒");//如果放入的字符串格式与定义的字符串格式不一致，则抛出解析异常
        System.out.println(date1);
    }
}
