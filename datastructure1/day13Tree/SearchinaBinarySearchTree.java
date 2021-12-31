package com.leetcode.datastructure1.day13Tree;

//https://leetcode.com/problems/search-in-a-binary-search-tree/
public class SearchinaBinarySearchTree {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null || root.val == val)
			return root;

		if (root.val < val)
			return searchBST(root.right, val);
		else
			return searchBST(root.left, val);
	}
}
