package com.youkeda;

import java.util.Arrays;

public class QuickSort { /*快速排序的主要逻辑 (1) 左指针依次往右侧移动，当遇到大于或者等于轴 的值，则停止 (2) 右指针相反，依次往左侧移动，当遇到小于或者等于轴 的值，则停止 (3) 将左右两个指针指向的值进行互换 (4) 互换以后，然后继续按照上面（1）- （3）执行，直到左指针和右指针重叠。 (5) 将左右两个指针指向的值和轴 互换 *//* 快速排序*/

    public static void quickSort(int[] array) { /* 调用快速排序的核心，传入left，right*/
        quickSortCore(array, 0, array.length - 1);
    } /* 快速排序的核心，同样也是递归函数*/

    public static void quickSortCore(int[] array, int left, int right) { /* 递归基准条件，left >= right 即表示数组只有1个或者0个元素。*/
        if (left >= right) return;
        int pivotIndex = partition(array, left, right); /* 递归调用左侧和右侧数组分区*/
        quickSortCore(array, left, pivotIndex - 1);
        quickSortCore(array, pivotIndex + 1, right);
    }//    // 对数组进行分区，并返回当前轴所在的位置 public static int partition(int[] array, int left, int right) { int

    //        selectValue=array[right];
//        right-=1;
//        while(left<right){
//            if(array[left]<selectValue){
//                left++;
//            }
//            if(array[right]>selectValue){
//                right--;
//            }
//            if(array[left]>selectValue&&array[right]<selectValue){
//                int temp=array[left];
//                array[left]=array[right];
//                array[right]=temp;
//                left++;
//                if(left==right){
//                    return right;
//                }
//                right--;
//                if(left==right){
//                    return left;
//                }
//            }
//        }
//        if(left==right||(right-left==1)){
//            int temp=array[right];
//            array[right]=selectValue;
//            array[array.length-1]=temp;
//        }
//        System.out.println(right);
//        return right;
//    }
    /* 对数组进行分区，并返回当前轴所在的位置*/
    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];

        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            /* 左指针移动*/
            while (array[leftIndex] <= pivot && leftIndex < right) {
                leftIndex++;
            }
            /* 右指针移动*/
            while (array[rightIndex] >= pivot && rightIndex > 0) {
                rightIndex--;
            }

            if (leftIndex >= rightIndex) {
                break;
            } else {
                swap(array, leftIndex, rightIndex);
            }
        }

        swap(array, leftIndex, right);
        return leftIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        /* Arrays.toString 可以方便打印数组内容*/
        System.out.println("raw: " + Arrays.toString(array));
        quickSort(array);
        System.out.println("result: " + Arrays.toString(array));
    }
}
