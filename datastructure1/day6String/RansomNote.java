package com.leetcode.datastructure1.day6String;

//https://leetcode.com/problems/ransom-note/
public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		if (magazine.length() < ransomNote.length())
			return false;

		int freq[] = new int[26];
		for (int i = 0; i < magazine.length(); ++i)
			++freq[magazine.charAt(i) - 'a'];
		for (int i = 0; i < ransomNote.length(); ++i)
			--freq[ransomNote.charAt(i) - 'a'];
		for (int i = 0; i < 26; ++i)
			if (freq[i] < 0)
				return false;
		return true;
	}
}
//Time Complexity T(n) = O(n)