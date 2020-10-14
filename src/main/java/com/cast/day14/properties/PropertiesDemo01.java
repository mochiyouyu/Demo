package com.cast.day14.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("张三","13");
        prop.setProperty("李四","19");
        prop.setProperty("王五","20");

        FileWriter fw = new FileWriter("src\\main\\java\\com\\cast\\day14\\properties\\prop.txt");

        prop.store(fw,"save data");
        fw.close();
    }
}
