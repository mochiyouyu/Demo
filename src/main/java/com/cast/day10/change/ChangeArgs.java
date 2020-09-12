package com.cast.day10.change;

public class ChangeArgs {
    public static void main(String[] args) {
        /*int result = add(); 说明传入的参数列表长度为0*/
        int result = add(1,2,3,4,5,6,7,8,9,0);//就会创建长度为10的数组，来存储传递过来的参数new int[]{1,2,3,4,5,6,7,8,9,0}
        System.out.println(result);

        method("asa",232,22.4,'孟');//接收Object对象
    }
    /*
    已知参数数据类型，但是不知道参数的个数可以用(参数数据类型...参数名称)
    注意事项：
     1.一个方法只能有一个可变参数列表
     2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
     */
    public static int add(int...arr){
        System.out.println(arr);
        System.out.println(arr.length);
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        return s;
    }

    /*public static void method(int...a,String...b){

    }*/ //错误
   /* public static void method(int a,int b, double c ,String...d){

    }*///正确

    public static void method(Object...objects){

    }

}
