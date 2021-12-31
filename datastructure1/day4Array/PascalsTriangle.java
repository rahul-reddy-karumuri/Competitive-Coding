package com.leetcode.datastructure1.day4Array;
import java.util.*;
//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; ++i) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			for (int j = 1; j <= i; ++j) {
				if (j == i)
					row.add(1);
				else
					row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
			}
			ans.add(row);
		}
		return ans;
	}
}

//Time Complexity T(n) = O(n^2)