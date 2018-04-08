package com.whl.algorithm;

/**
 * Created by whling on 2018/4/8.
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {12, 122, 98, 22, -9};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //取最小
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
