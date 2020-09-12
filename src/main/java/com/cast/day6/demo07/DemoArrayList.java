package com.cast.day6.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    /*
    接口可以作为返回值和参数
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> result = addNAmes(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
    public static List<String> addNAmes(List<String> list){
        list.add("小明");
        list.add("小白");
        list.add("小紫");
        list.add("无");
        return list;
    }
}
