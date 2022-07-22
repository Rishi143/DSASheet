package com.dsa.overall;

import java.util.Arrays;

public class _13MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals,(o1, o2)->o1[0]-o2[0]);
        int[][] mergedArray = new int[len][2];
        for(int i = 0;i < len;i++) {
            mergedArray[i][0] = mergedArray[i][1] = -1;
        }
        int index = -1;
        for(int i = 0;i < len;i++) {
            if(index == -1) {
                index++;
                mergedArray[i][0] = intervals[i][0];
                mergedArray[i][1] = intervals[i][1];
            } else {
                if(canBeMerged(mergedArray[index][0],mergedArray[index][1],intervals[i][0],intervals[i][1])) {
                    if(intervals[i][0] < mergedArray[index][0]) {
                        mergedArray[index][0] = intervals[i][0];
                    }
                    if(intervals[i][1] > mergedArray[index][1]) {
                        mergedArray[index][1] = intervals[i][1];
                    }
                } else {
                    index++;
                    mergedArray[index][0] = intervals[i][0];
                    mergedArray[index][1] = intervals[i][1];
                }
            }
        }
        int finalLength = 0;
        for(int i = 0;i < len;i++) {
            if(mergedArray[i][0] != -1) {
                finalLength++;
            } else {
                break;
            }
        }
        int[][] finalArray = new int[finalLength][2];
        for(int i = 0;i < finalLength;i++) {
            finalArray[i][0] = mergedArray[i][0];
            finalArray[i][1] = mergedArray[i][1];
        }
        return finalArray;
    }

    private boolean canBeMerged(int i1,int j1,int i2,int j2) {
        //System.out.println(i1+","+j1+","+i2+","+j2);
        if((i2 <= j1 && j1 <= j2) || (i1 <= i2 && j1 == j2) || (i2 >= i1 && j2 == j1) || (i1 <= j2 && j2 <= j1)) {
            return true;
        }
        return false;
    }
}
