package com.whl.algorithm;

/**
 * Created by whling on 2018/3/30.
 * 二分查找：O(logn)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 9, 19, 321, 2321};

        int a = 3212;

        int index = binarysearch(arr, a);
        System.out.println(index);
    }

    private static int binarysearch(int[] arr, int a) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a == arr[mid]) {
                return mid;
            } else if (a > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
