package com.cast.day11.exception;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        //编译期异常
      /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        Date date1 = null;
        Date date2 = new Date();
        String str = null;
        try {
//             date = sdf.parse("2018.09.09");
            date1 = sdf.parse("2020-09-09");
            str = sdf.format(date2);
        } catch (ParseException e) {
            System.out.println("日期格式异常");
        }
        System.out.println(date);
        System.out.println(date1);
        System.out.println(str);*/

        int[] arr = {1,2,3,4};
        try{
            System.out.println(arr[4]);
        }catch (RuntimeException e){
            System.out.println(e);
            System.out.println("运行期异常 ");
        }
    }
}
