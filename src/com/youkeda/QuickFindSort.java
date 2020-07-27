package com.youkeda;

import java.util.Arrays;

public class QuickFindSort {
    //快速选择，返回选中的元素
    public static int quickFind(int[] array,int aim){
       return quickFindCore(array,aim,0,array.length-1);
    }
    // 快速选择的核心，同样也是递归函数
    public static int quickFindCore(int[] array, int aim, int left, int right) {
        // 递归基准条件，left >= right 即表示数组只有1个或者0个元素，返回当前的元素
        if (left >= right) {
            return array[left];
        }
        // 根据轴分区
        int pivotIndex = partition(array, left, right);
        // 根据 aim 确定继续递归的方向
        if (pivotIndex > aim) {
            return quickFindCore(array, aim, left, pivotIndex - 1);
        } else if (pivotIndex < aim) {
            return quickFindCore(array, aim, pivotIndex + 1, right);
        } else {
            return array[pivotIndex];
        }
    }
    //选择轴
    public static int partition(int[] array,int left,int right){
        int selectValue=array[right];
        int leftIndex=left;
        int rightIndex=right-1;
        while(true){
            //指针向右移动
            while(array[leftIndex]<selectValue&&leftIndex<right){
                leftIndex++;
            }
            //指针向左移动
            while(array[rightIndex]>selectValue&&rightIndex>0){
                rightIndex--;
            }
            if(leftIndex>=rightIndex){
                break;
            }else{
                swap(array,leftIndex,rightIndex);
            }
        }
        swap(array,leftIndex,right);
        return leftIndex;
    }
    public static void swap(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void main(String[] args) {
        int[] array = {72, 77, 48, 17, 71, 2, 25, 97, 82, 5, 2, 18, 15, 57, 7, 48, 93, 47, 38, 74, 18, 93, 98, 41, 54, 4, 47, 4, 63, 76};
        System.out.println("raw: " + Arrays.toString(array));
        // 目标是倒数第 6 个元素
        int result = quickFind(array, array.length - 6);
        System.out.println("result: " + result);
    }
}
