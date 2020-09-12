package com.youkeda;

import java.util.Arrays;

public class GuiBingSort {
    public static int[] subArray(int[] array, int left, int right) {
        int[] result = new int[right - left];
        for (int i = left; i < right; i++) result[i - left] = array[i];
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int middle = array.length / 2;
        int[] left = mergeSort(subArray(array, 0, middle));
        int[] right = mergeSort(subArray(array, middle, array.length));
        int l = 0;
        int r = 0;
        int index = 0; /*依次比较两个数组*/
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                array[index] = left[l];
                l++;
            } else {
                array[index] = right[r];
                r++;
            }
            index++;
        } /*如果左侧数组有剩余*/
        if (l < left.length) {
            for (int i = l; i < left.length; i++) {
                array[index] = left[i];
                index++;
            }
        }/*如果数组右侧有剩余*/
        if (r < right.length) {
            for (int i = r; i < right.length; i++) {
                array[index] = right[i];
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3}; /* Arrays.toString 可以方便打印数组内容*/
        System.out.println("raw: " + Arrays.toString(array));
        int[] result = mergeSort(array);
        System.out.println("result: " + Arrays.toString(result));
    }
}
