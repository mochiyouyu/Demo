package com.cast.day11ThreadAndException.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaDemo03 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list,new Person("张三",12),new Person("李四",20),new Person("王五",18));
        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();//升序
            }
        });*/

        //使用Lambda，简化匿名内部类
        /*Collections.sort(list,(Person o1,Person o2)->{
            return o1.getAge() - o2.getAge();
        });*/

        ////优化省略Lambda
        Collections.sort(list,(o1,o2)->o1.getAge() - o2.getAge());

        for (Person person : list) {
           // System.out.println(person.getName()+":"+person.getAge());
            System.out.println(person);
        }
    }
}
