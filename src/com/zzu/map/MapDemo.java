package com.zzu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet()方法遍历key和value.");
        for (String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        //第二种
        System.out.println("通过Map.entrySet()使用iterator遍历key和value");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println("key="+entry.getKey()+" "+"value="+entry.getValue());
        }

        //第三种  推荐  尤其在容量大时
        System.out.println("通过map.values()遍历所有的value但不能遍历key");
        for(String v:map.values()){
            System.out.println("value"+":"+v);
        }
    }
}
