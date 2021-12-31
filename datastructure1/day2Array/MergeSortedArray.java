package com.leetcode.datastructure1.day2Array;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i1 = m - 1, i2 = n - 1, index = m + n - 1;
		while (i1 >= 0 && i2 >= 0) {
			if (nums1[i1] > nums2[i2])
				nums1[index--] = nums1[i1--];
			else
				nums1[index--] = nums2[i2--];
		}
		while (i2 >= 0)
			nums1[index--] = nums2[i2--];
	}
}
//Time Complexity T(n) = O(m+n)