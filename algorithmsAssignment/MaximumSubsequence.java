package com.algorithms;

public class MaximumSubsequence {
	static int maxSum = 0, firstIndex=0, lastIndex=0, leftIndex = 0, rightIndex = 0, 
			leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
	static void mergeSum(int arr[], int l, int m, int r) {
		int leftSubsum = 0;
		int rightSubsum = 0;
		int i = m;
		while (i >= 0) {
			leftSubsum += arr[i];
			if(leftMax<leftSubsum) {
				leftMax = leftSubsum;
				leftIndex = i;
			}
			--i;
		}
		int j = m+1;
		while (j <= r) {
			rightSubsum += arr[j];
			if(rightMax<rightSubsum) {
				rightMax = rightSubsum;
				rightIndex = j;
			}
			++j;
		}
		if(maxSum < Math.max(leftSubsum+rightSubsum,Math.max(leftMax, rightMax))) {
			maxSum = Math.max(leftSubsum+rightSubsum,Math.max(leftMax, rightMax));
			firstIndex = leftIndex+1;
			lastIndex = rightIndex+1;
			System.out.println("firstIndex: "+firstIndex+"   lastIndex: "+lastIndex);
		}
	}
	static void divide(int arr[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			divide(arr, l, m);
			divide(arr, m + 1, r);
		    mergeSum(arr, l, m, r);
		}
	}
	public static void main(String args[]) {
		int arr[] = { -3, 12, -6, 10, -5, 2 };
		System.out.println("Given Array");
		for (int i = 0; i < arr.length ; ++i)
			System.out.print(arr[i] + " ");
		divide(arr, 0, arr.length - 1);
		System.out.println(maxSum);
	}
}
