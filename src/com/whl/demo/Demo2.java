package com.whl.demo;

/**
 * Created by whling on 2018/3/31.
 */
public class Demo2 {

    /**
     * {1,2,3,4,'a','b','c','d'} -> {1,'a',2,'b',3,'c',4,'d'}
     */
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e'};
        int n = arr.length / 2, j = 0, k = 0;

        Object[] f = new Object[n];

        for (int i = 0; i < n; i++) {
            f[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                arr[i] = arr[j + n];
                j++;
            } else {
                arr[i] = f[k];
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
