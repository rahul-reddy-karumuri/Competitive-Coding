package com.leetcodeDay4;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
	public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char ch = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = ch;
        }
    }
}
