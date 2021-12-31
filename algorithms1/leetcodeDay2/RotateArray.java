package com.leetcodeDay2;

//https://leetcode.com/problems/rotate-array/submissions/

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int arrayLength = nums.length;
		if (arrayLength != 1) {
			if (arrayLength < k) {
				k = k % arrayLength;
			}
			int ans[] = new int[arrayLength];
			for (int i = 0; i < k; i++) {
				ans[i] = nums[arrayLength - k + i];
			}
			for (int i = 0; i < arrayLength - k; i++) {
				ans[i + k] = nums[i];
			}
			for (int i = 0; i < arrayLength; i++) {
				nums[i] = ans[i];
			}
		}

	}
}
