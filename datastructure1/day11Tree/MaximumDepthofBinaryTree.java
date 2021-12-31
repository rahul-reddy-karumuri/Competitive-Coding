package com.leetcode.datastructure1.day11Tree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
