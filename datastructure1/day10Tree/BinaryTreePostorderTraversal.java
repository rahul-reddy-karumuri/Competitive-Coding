package com.leetcode.datastructure1.day10Tree;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		return dfs(root, new ArrayList<Integer>());
	}

	private List<Integer> dfs(TreeNode root, List<Integer> list) {
		if (root == null)
			return list;
		list = dfs(root.left, list);
		list = dfs(root.right, list);
		list.add(root.val);
		return list;
	}
}
