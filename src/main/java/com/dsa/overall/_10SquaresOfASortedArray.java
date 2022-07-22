package com.dsa.overall;

public class _10SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int end = len-1;
        int[] res = new int[len];
        int left = 0,right = len-1;
        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[end] = nums[left]*nums[left];
                left++;
                end--;
            } else {
                res[end] = nums[right]*nums[right];
                right--;
                end--;
            }
        }
        return res;
    }
}
