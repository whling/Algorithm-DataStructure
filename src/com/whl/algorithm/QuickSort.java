package com.whl.algorithm;

/**
 * Created by whling on 2018/3/30.
 * 快排，思想：
 *  选取一个基值，然后最高位和他比较，如果比他大，则高位索引递减，否则则将高位小的数赋给基值索引位
 *  高位赋值完成之后，要进行低位和基值的比较，如果低位比他小，则低位索引递增，否则赋值给高位索引
 *  这么一轮循环之后，取出基值所在索引位置，此时基值左边都是小于他的数，基值右边都是大与他的数
 *  再递归调用排序这个过程就行了
 *
 *  时间复杂度：O(logn) 最坏:O(n^2)
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {23, 12, 343, 321, 1, -2321};


        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = getMiddle(arr, low, high);
            quickSort(arr, low, mid - 1);
            quickSort(arr, mid + 1, high);
        }
    }

    private static int getMiddle(int[] arr, int low, int high) {
        int base = arr[low];
        while (low < high) {
            while (low < high && base <= arr[high]) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && base >= arr[low]) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = base;
        return low;
    }


}
