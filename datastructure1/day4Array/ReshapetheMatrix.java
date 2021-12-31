package com.leetcode.datastructure1.day4Array;

//https://leetcode.com/problems/reshape-the-matrix/
public class ReshapetheMatrix {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		if ((r == mat.length && c == mat[0].length) || (r * c != mat.length * mat[0].length))
			return mat;

		int res[][] = new int[r][c];
		int ri = 0, cj = 0;
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[0].length; ++j) {
				res[ri][cj++] = mat[i][j];
				if (cj >= res[0].length) {
					cj = 0;
					++ri;
				}
			}
		}
		return res;

	}
}
//Time Complexity T(n) = O(r*c)