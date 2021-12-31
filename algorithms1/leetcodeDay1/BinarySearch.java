package com.leetcodeDay1;

//https://leetcode.com/problems/binary-search/
public class BinarySearch {
	public int search(int[] nums, int target) {
        if(nums[nums.length/2] == target)
           return nums.length/2;
        else if(nums[nums.length/2] > target)
            return searchElement(nums, 0 , nums.length/2-1, target);
        else
            return searchElement(nums, nums.length/2+1, nums.length-1, target);
    }
    
    public int searchElement(int[] nums, int firstIndex, int lastIndex, int target){
        if(firstIndex<=lastIndex){
            int mid = firstIndex + (lastIndex-firstIndex)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                return searchElement(nums,firstIndex,mid-1, target);
            else
                return searchElement(nums,mid+1,lastIndex, target);
        }
        else
            return -1;
    }
}
