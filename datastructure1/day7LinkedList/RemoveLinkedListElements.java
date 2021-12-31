package com.leetcode.datastructure1.day7LinkedList;

//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return head;

		ListNode temp = new ListNode(-1);
		temp.next = head;
		ListNode currentNode = temp;
		while (currentNode.next != null) {
			if (currentNode.next.val == val)
				currentNode.next = currentNode.next.next;
			else
				currentNode = currentNode.next;
		}

		return temp.next;
	}
}
