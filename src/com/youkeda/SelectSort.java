package com.youkeda;

import java.util.Arrays;

public class SelectSort {
    // 选择排序
    public static void selectSort(int[] array) {
        int i=0;
        while(i<array.length-1){
            int index=0;
            int maxValue=array[index];
            for(int j=1;j<array.length-i;j++){
                if(maxValue>array[j]){
                    if(j==array.length-i-1){
                        int temp=array[index];
                        array[index]=array[j];
                        array[j]=temp;
                    }
                }else{
                    int temp=maxValue;
                    maxValue=array[j];
                    array[index]=temp;
                    index=j;
                }

            }
            for(int k=0;k<array.length;k++){
                System.out.print(array[k]);
            }
            System.out.println();
            i++;
        }

    }


    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        // Arrays.toString 可以方便打印数组内容
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
