package com.leetcode.datastructure1.day6String;

//https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterinaString {
	public int firstUniqChar(String s) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); ++i)
			++freq[s.charAt(i) - 'a'];
		for (int i = 0; i < s.length(); ++i)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}
}
//Time Complexity T(n) = O(n)