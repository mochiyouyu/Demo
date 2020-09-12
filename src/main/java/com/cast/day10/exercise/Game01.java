package com.cast.day10.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Game01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = map.keySet();
        /*for (int i = 0; i < str.length(); i++) {
           char index = str.charAt(i);
            if(set.contains(index)){
                map.put(index,map.get(index)+1);
            }else{
                map.put(index,1);
            }
        }*/
        char char1[] = str.toCharArray();
        for (char c : char1) {
            if(set.contains(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for (Character character : set) {
            System.out.println(character+":"+map.get(character));
        }
    }
}
