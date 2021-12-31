package com.leetcode.datastructure1.day9Stack;

import java.util.*;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch == '(')
				stack.push(')');
			else if (ch == '[')
				stack.push(']');
			else if (ch == '{')
				stack.push('}');
			else if (stack.isEmpty() || stack.pop() != ch)
				return false;
		}
		return stack.isEmpty();
	}
}
