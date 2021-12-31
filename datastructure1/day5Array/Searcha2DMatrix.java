package com.leetcode.datastructure1.day5Array;

//https://leetcode.com/problems/search-a-2d-matrix/
public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0)
			return false;

		int rows = matrix.length;
		int columns = matrix[0].length;
		int low = 0;
		int high = rows * columns - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int midValue = matrix[mid / columns][mid % columns];
			if (midValue == target)
				return true;
			else if (target > midValue)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;
	}
}
//Time Complexity T(n) = O(logn)