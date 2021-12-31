package com.algorithms;

public class SelectAlgorithm {
	
	static int array[] = {1,2,3,8,9,10,11};
	
	public static int select(int arr[],int left, int right, int index) {
		int q = partition(arr,left,right);
		int k = right-left;
		if(index==k)
			return arr[q];
		else if(index<k)
			return select(arr,left,q,index);
		else
			return select(arr,q+1,right,index-k);
	}

	public static int partition(int arr[], int left, int right) {
		int x = arr[right];
		int i = left-1;
		for(int j=left;j<right;j++) {
			if(arr[j] <= x) {
				i+=1;
				arr = swapVariables(arr, i, j);
				System.out.println(i);
			}
		}
		arr = swapVariables(arr, ++i, right);
		return i;
	}
	static int[] swapVariables(int arr[], int x, int y) {
		 int temp = arr[x];
		 arr[x] = arr[y];
		 arr[y] = temp;
		 return arr;
	}
	
	public static void main(String[] args) {

		int k = 4;
		int x = select(array,0,array.length-1,array.length/2);
		int b[] = new int[array.length];
		for(int i=0;i<b.length;i++) {
			b[i] = Math.abs(array[i]-x);
		}
		int y = select(b, 0, b.length-1, k);
		for(int i=0;i<b.length-1;i++) {
			if(b[i]<y)
				System.out.println(b[i]);
		}
	}

}
