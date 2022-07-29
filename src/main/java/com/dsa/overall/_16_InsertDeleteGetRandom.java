package com.dsa.overall;

import java.util.*;

public class _16_InsertDeleteGetRandom {
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    Random rand = new Random();

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastIndex = list.size() - 1;
        if(index != lastIndex) {
            int last = list.get(lastIndex);
            list.set(index,last);
            map.put(last,index);
        }
        list.remove(lastIndex);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
