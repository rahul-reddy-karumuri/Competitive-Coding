package com.leetcode.datastructure1.day8LinkedList;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.val == currentNode.next.val)
				currentNode.next = currentNode.next.next;
			else
				currentNode = currentNode.next;
		}
		return head;
	}
}
