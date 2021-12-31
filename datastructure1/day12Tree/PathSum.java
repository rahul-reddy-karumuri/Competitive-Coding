package com.leetcode.datastructure1.day12Tree;

//https://leetcode.com/problems/path-sum/
public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;

		Stack<TreeNode> nodeStack = new Stack();
		Stack<Integer> sumStack = new Stack();

		nodeStack.add(root);
		sumStack.add(targetSum - root.val);

		while (!nodeStack.isEmpty()) {
			TreeNode currentNode = nodeStack.pop();
			int currentSum = sumStack.pop();

			if (currentSum == 0 && currentNode.left == null && currentNode.right == null)
				return true;

			if (currentNode.right != null) {
				nodeStack.add(currentNode.right);
				sumStack.add(currentSum - currentNode.right.val);
			}

			if (currentNode.left != null) {
				nodeStack.add(currentNode.left);
				sumStack.add(currentSum - currentNode.left.val);
			}
		}
		return false;
	}
}
