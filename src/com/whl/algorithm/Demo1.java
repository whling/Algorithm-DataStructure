package com.whl.algorithm;

/**
 * Created by whling on 2018/3/30.
 */
public class Demo1 {
    /**
     * {0,2,0,2,2,4,0} -> {2,2,2,4,0,0,0}
     */
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 2, 2, 4, 0};

        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[n] = arr[i];
                n++;
            }
        }

        while (n < arr.length) {
            arr[n] = 0;
            n++;
        }

        for (int s : arr) {
            System.out.println(s);
        }
    }
}
