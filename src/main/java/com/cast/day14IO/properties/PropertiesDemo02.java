package com.cast.day14IO.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\main\\java\\com\\cast\\day14\\properties\\prop.txt");
        prop.load(fr);
        fr.close();
        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+":"+prop.getProperty(string));
        }
    }
}
