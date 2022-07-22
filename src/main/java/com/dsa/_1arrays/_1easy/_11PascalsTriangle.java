package com.dsa._1arrays._1easy;

import java.util.ArrayList;
import java.util.List;

public class _11PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int row = 1;row <= numRows;row++) {
            List<Integer> list = new ArrayList<>();
            for(int col = 0; col < row;col++) {
                if(col == 0 || col == row-1) {
                    list.add(1);
                } else {
                    list.add(result.get(row-2).get(col)+result.get(row-2).get(col-1));
                }
            }
            result.add(list);
        }
        return result;
    }
}
