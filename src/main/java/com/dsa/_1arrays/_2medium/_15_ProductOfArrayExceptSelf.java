package com.dsa._1arrays._2medium;

public class _15_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0;i < nums.length;i++) {
            if(i == 0) {
                result[i] = 1;
            } else {
                result[i] = result[i-1] * nums[i-1];
            }
        }
        int postfix = 1;
        for(int i = len-2;i >= 0;i--) {
            postfix = postfix * nums[i+1];
            result[i] = postfix * result[i];
        }
        return result;
    }
}
