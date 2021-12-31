package com.algorithms;
//Assignment2 Q1
public class MaximumSubarraySum {
	static int leftIndex = 0;
	static int maxSum = Integer.MIN_VALUE;
	static int rightIndex = 0;
	
	static int crossSum(int arr[], int left, int mid, int high) {
		int sum = 0;
		int leftSubSum = Integer.MIN_VALUE, rightSubSum = Integer.MIN_VALUE;
		int index = mid;
		int li = 0, ri = 0;
		while(index>=left) {
			sum += arr[index];
			if(sum > leftSubSum) {
				leftSubSum = sum;
				li = index;
			}
			index--;
		}
		index = mid+1;
		sum = 0;
		while(index<=high) {
			sum += arr[index];
			if(sum > rightSubSum) {
				rightSubSum = sum;
				ri = index;
			}
			index++;
		}
		int result = Math.max(leftSubSum + rightSubSum, Math.max(leftSubSum, rightSubSum));
		if(maxSum < result) {
			maxSum = result;
			leftIndex = li+1;
			rightIndex = ri+1;
		}
		return maxSum;
	}
	
	static int maxSum(int arr[], int low, int high) {
		if(low == high)
			return arr[low];
		int mid = low + (high - low) / 2;
		int leftSum = maxSum(arr, low, mid);
		int rightSum = maxSum(arr, mid + 1, high);
		int crossSum = crossSum(arr, low, mid, high);
		return Math.max(Math.max(leftSum, rightSum),crossSum);
	}
	public static void main(String[] args) {
		int arr[] = { -3, 12, -6, 10, -5, 2 };
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int max_sum = maxSum(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("Maximum contiguous sum is " + max_sum);
		System.out.println("left index: "+leftIndex+" right index: "+rightIndex);
	}
}
