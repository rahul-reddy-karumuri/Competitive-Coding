package com.leetcode.datastructure1.day8LinkedList;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = prev;
			prev = head;
			head = nextNode;
		}
		return prev;
	}
}
