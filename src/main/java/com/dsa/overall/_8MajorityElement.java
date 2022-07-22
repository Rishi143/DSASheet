package com.dsa.overall;

import java.util.HashMap;
import java.util.Map;

public class _8MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> numCount = new HashMap<>();
        for(int num : nums) {
            numCount.put(num,numCount.getOrDefault(num,0)+1);
            if(numCount.get(num) > len/2) {
                return num;
            }
        }
        return -1;
    }
}
