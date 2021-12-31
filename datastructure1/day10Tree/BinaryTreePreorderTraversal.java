package com.leetcode.datastructure1.day10Tree;
//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		return dfs(root, new ArrayList<Integer>());
	}

	private List<Integer> dfs(TreeNode root, List<Integer> list) {
		if (root == null)
			return list;

		list.add(root.val);
		list = dfs(root.left, list);
		return dfs(root.right, list);
	}
}
//Time Complexity T(n) = O(n)