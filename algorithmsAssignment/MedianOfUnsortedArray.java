package com.algorithms;
//Assignment2 Q4
public class MedianOfUnsortedArray {

	public static int partition(int arr[], int left, int right) {
		int x = arr[right];
		int i = left-1;
		for(int j=left;j<right;j++) {
			if(arr[j] < x) 
				swapVariables(arr, ++i, j);
		}
		swapVariables(arr, ++i, right);
		return i;
	}
	
	static int[] swapVariables(int arr[], int x, int y) {
		 arr[x] = arr[x] + arr[y];  
		 arr[y] = arr[x] - arr[y];  
		 arr[x] = arr[x] - arr[y];
		 return arr;
	}
	
	static int getMedian(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if(index == (left+right)/2) 
			return arr[index];
		else if(index > (left+right)/2)
			return getMedian(arr, left, index-1);
		else 
			return getMedian(arr, index+1, right);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,8,9,10,11};
		for(int i=0;i<arr.length;i++)
		  System.out.print(arr[i]+" ");
		System.out.println();
		int median = getMedian(arr, 0, arr.length-1);
		System.out.println(median);
	}
}