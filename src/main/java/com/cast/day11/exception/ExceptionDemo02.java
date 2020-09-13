package com.cast.day11.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//如果finally中有返回语句，那么方法返回的永远都是finally里面的方法。
public class ExceptionDemo02 {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        try{
           /* int arr[] = new int[3];
            System.out.println(arr[3]);*/
            List<Integer> list = new ArrayList<>();
            Collections.addAll(list,1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        /*}catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());*/
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
