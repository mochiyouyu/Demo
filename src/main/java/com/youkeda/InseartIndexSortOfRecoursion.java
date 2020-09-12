package com.youkeda;

import java.util.Arrays;

public class InseartIndexSortOfRecoursion {
    public static int SearchIndex(int[] array,int left,int right,int aim){
        if(left<right){
            int middle=(left+right)/2;
            int value=array[middle];
            if(value>aim){
                right=middle-1;
            }else{
                left=middle+1;
            }
            return SearchIndex(array,left,right,aim);
        }else if(left==right){
            if(array[left]>aim){
                return left-1;
            }
        }else{
            return left;
        }
        return-1;
    }
    public static void insertSort(int[] array){
        for (int i = array.length-2; i >=0 ; i--) {
            int selectValue=array[i];
            int index=SearchIndex(array,i+1,array.length-1,selectValue);
            int j = i + 1;
            while (j <= index) {
                array[j - 1] = array[j];
                j++;
            }
            array[j - 1] = selectValue;
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
