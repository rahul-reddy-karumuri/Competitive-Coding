package com.Graphs;

import java.util.*;

class Pair implements Comparable<Pair>{
    int num;
    int count;
    Pair(int num,int count){
        this.num = num;
        this.count = count;
    }
    public int compareTo(Pair p){
        return this.count-p.count;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;++i)
            if(map.get(nums[i]) != null)
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 
        for(int key:map.keySet()){
             Pair p = new Pair(key,map.get(key));
             pq.add(p);
        }
        
        int result[] = new int[k];
        for(int i=0;i<k;++i)
            result[i] = map.get(pq.poll().num);
            
        return result;
    }
}