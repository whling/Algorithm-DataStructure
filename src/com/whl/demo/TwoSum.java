package com.whl.demo;

import java.util.HashMap;

/**
 * Created by whling on 2018/3/31.
 */
public class TwoSum {

    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 26;
        int[] res = twoSum(arr, target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val) && map.get(val) != i) { //不能是自己
                j = map.get(val);
                res[0] = i;
                res[1] = j;
                break;
            }
        }
        return res;
    }
}
