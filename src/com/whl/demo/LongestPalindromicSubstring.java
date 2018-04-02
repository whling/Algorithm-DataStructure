package com.whl.demo;

/**
 * Created by whling on 2018/4/2.
 * 最长回文子串
 */
public class LongestPalindromicSubstring {
    /**
     * Input: "babad"
     * <p>
     * Output: "bab"
     * <p>
     * Note: "aba" is also a valid answer.
     */

    public static void main(String[] args) {
        String data = "babad";
        for (int i = 0; i < data.length(); i++) {
            for (int j = i + 2; j < data.length(); j++) {
                String str = data.substring(i, j);
                if (isPalindromic(str)) {
                    System.out.println(str);
                    break;
                }
            }
        }
    }

    private static boolean isPalindromic(String str) {
        int length = str.length();
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }


}
