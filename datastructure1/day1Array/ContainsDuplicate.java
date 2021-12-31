package com.leetcode.datastructure1.day1Array;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; ++i)
			if (!set.add(nums[i]))
				return true;
		return false;
	}
}
//Time Complexity T(n) = O(n)