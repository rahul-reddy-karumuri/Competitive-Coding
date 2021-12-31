package com.leetcodeDay3;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
	 public int[] twoSum(int[] numbers, int target) {
	        int ans[] = new int[2];
	        for(int i=0;i<numbers.length-1;i++){
	            ans[0] = i+1;
	            boolean isAnswerFound = false;
	            for(int j=i+1;j<numbers.length;j++){
	               if(numbers[i]+numbers[j] == target){
	                 isAnswerFound = true;
	                   ans[1] = j+1;
	                   break;
	               }        
	            }
	            if(isAnswerFound){
	                break;
	            }
	        }
	        return ans;
	    }
}
