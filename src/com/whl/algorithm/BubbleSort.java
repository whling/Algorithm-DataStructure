package com.whl.algorithm;


/**
 * Created by whling on 2018/4/8.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {21, 2342, 1, 42, 0, -98};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
