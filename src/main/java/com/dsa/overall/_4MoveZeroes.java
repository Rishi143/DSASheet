package com.dsa.overall;

public class _4MoveZeroes {
    public void moveZeroes(int[] nums) {
        int ind = 0,len = nums.length;
        for(int i = 0;i < len;i++) {
            if(nums[i] != 0) {
                nums[ind] = nums[i];
                ind++;
            }
        }
        while(ind < len) {
            nums[ind] = 0;
            ind++;
        }
    }
}
