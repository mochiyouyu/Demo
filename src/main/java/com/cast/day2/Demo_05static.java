package com.cast.day2;

public class Demo_05static {
    /*
    静态代码块的格式：
    public class ***{
        static{
            ***静态代码块的内容
        }
    }

    特点：当第一次调用本类时，静态代码块执行唯一的依次
    静态内容总是优先于非静态，所以静态方法先于构造方法
    静态代码块的应用：
    用来一次性的为静态变量赋值
     */
    public static void main(String[] args) {
        Student stu1=new Student("孟浩",18);
        Student.room="110教室";
        System.out.println("姓名"+stu1.getName()+ " "+"年龄"+stu1.getAge()+" "+"教室"+stu1.room+" "+"学号是"+stu1.getStuId());
        Student stu2=new Student("小明",23);
        System.out.println("姓名"+stu2.getName()+ " "+"年龄"+stu2.getAge()+" "+"教室"+stu2.room+" "+"学号是"+stu2.getStuId());
    }
}
