package com.cast.day14IO.objectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\com\\cast\\day14\\objectOutputStream\\b.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ArrayList<Person> arrayList = (ArrayList<Person>) o;
        for (Person person : arrayList) {
            System.out.println(person.getName()+":"+person.getAge());
        }
    }
}
