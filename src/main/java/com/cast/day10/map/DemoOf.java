package com.cast.day10.map;

import java.util.List;
import java.util.Map;

public class DemoOf {
    public static void main(String[] args) {
       /* List<Integer> integers = List.of(1, 2, 3);
        System.out.println(integers);*/
        Map<String, Integer> a = Map.of("a", 1, "b", 2, "c", 3);
        System.out.println(a);
    }
}
