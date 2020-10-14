package com.cast.day14.properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("张三","13");
        prop.setProperty("李四","19");
        prop.setProperty("王五","20");
        String name1 = prop.getProperty("张三");
        System.out.println(name1);
        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            System.out.println(prop.getProperty(string));
        }
    }
}
