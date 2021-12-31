package com.leetcode.datastructure1.day5Array;

import java.util.HashSet;

//https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				if (board[i][j] != '.')
					if (!set.add(board[i][j] + "row" + i) || !set.add(board[i][j] + "column" + j)
							|| !set.add(board[i][j] + "box" + i / 3 + "-" + j / 3))
						return false;
			}
		}
		return true;
	}
}
//Time Complexity T(n) = O(n^2)