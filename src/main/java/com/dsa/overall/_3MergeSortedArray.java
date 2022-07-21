package com.dsa.overall;

public class _3MergeSortedArray {
    /*
    * Merge sorted array
    * */
    public void merge(int[] nums1, int m1, int[] nums2, int n1) {
        //Merging two arrays
        int len1 = nums1.length,len2 = nums2.length;
        int end = len1-1;
        int m = m1-1,n = n1-1;
        while(m >= 0 && n >= 0) {
            if(nums1[m] >= nums2[n]) {
                nums1[end] = nums1[m];
                end--;
                m--;
            } else {
                nums1[end] = nums2[n];
                n--;
                end--;
            }
        }
        while(n >= 0) {
            nums1[end] = nums2[n];
            n--;
            end--;
        }
    }
}
