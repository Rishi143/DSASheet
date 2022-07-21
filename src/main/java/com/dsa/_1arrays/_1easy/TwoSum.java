package com.dsa._1arrays._1easy;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    /*
    *
    * Add an element to a hash map
    * and then find in the further elements that if target-element is found
    * in the hashmap if it is found you can return both the numbers
    * */
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer,Integer> numMap = new HashMap<>();
        int len = nums.length;
        for(int i = 0;i < len;i++) {
            if(numMap.containsKey(target-nums[i])) {
                result[0] = i;
                result[1] = numMap.get(target-nums[i]);
                break;
            }
            numMap.put(nums[i],i);
        }
        return result;
    }
}
