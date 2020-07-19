package com.youkeda;

import java.util.Arrays;

public class InsertSort {
    // 插入排序
    public static void insertSort(int[] array) {
        int i=array.length-2;
        while(i>=0){
            int selectValue=array[i];
            for(int j=i+1;j<array.length;j++){
                if(selectValue>array[j]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
            for(int k=0;k<array.length;k++){
                System.out.print(array[k]);
            }
            System.out.println();
            i--;
        }

    }


    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        // Arrays.toString 可以方便打印数组内容
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
