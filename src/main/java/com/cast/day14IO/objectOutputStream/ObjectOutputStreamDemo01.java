package com.cast.day14IO.objectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\main\\java\\com\\cast\\day14\\objectOutputStream\\b.txt"));
        Person person1 = new Person("张三",18);
        Person person2 = new Person("李四",20);
        Person person3 = new Person("王五",19);
        ArrayList<Person> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,person1,person2,person3);
        oos.writeObject(arrayList);//存储的文件是二进制类型的
        oos.close();
    }
}
