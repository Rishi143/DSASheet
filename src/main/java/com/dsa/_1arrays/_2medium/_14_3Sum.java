package com.dsa._1arrays._2medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _14_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < len;i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                int low = i+1,high = len-1;
                int target = 0-nums[i];
                while(low < high) {
                    if(nums[low] + nums[high] == target) {
                        result.add(getList(nums[i],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low+1]) {
                            low++;
                        }
                        while(low < high && nums[high] == nums[high-1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return result;
    }

    public List<Integer> getList(int i, int j, int k) {
        List<Integer> tempList = new ArrayList<>();
        tempList.add(i);
        tempList.add(j);
        tempList.add(k);
        return tempList;
    }
}
