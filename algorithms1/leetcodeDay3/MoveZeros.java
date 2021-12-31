package com.leetcodeDay3;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
	public void moveZeroes(int[] nums) {
		int i = 0, j = 0;
		int len = nums.length - 1;
		while (i <= len) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
			i++;
		}
		j = len - j + 1;
		while (j > 0) {
			nums[len--] = 0;
			j--;
		}
	}
 
}
