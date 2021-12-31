package com.leetcode.datastructure1.day3Array;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int len1 = nums1.length - 1, len2 = nums2.length - 1;
		while (len1 >= 0 && len2 >= 0) {
			if (nums1[len1] == nums2[len2]) {
				list.add(nums1[len1]);
				--len1;
				--len2;
			} else if (nums1[len1] > nums2[len2]) {
				--len1;
			} else
				--len2;
		}
		int result[] = new int[list.size()];
		for (int i = 0; i < list.size(); ++i)
			result[i] = list.get(i);

		return result;
	}
}
//Time Complexity T(n) = O(nlogn)