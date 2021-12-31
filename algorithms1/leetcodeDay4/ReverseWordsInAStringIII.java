package com.leetcodeDay4;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordsInAStringIII {
	 public String reverseWords(String s) {
	        String ans = "";
	        String words[] = s.split(" ");
	        for(int j=0;j<words.length;j++){
	            String word = words[j];
	            char ch[] = word.toCharArray();
	            for(int i=0;i<ch.length/2;i++){
	              char ch1 = ch[i];
	              ch[i] = ch[ch.length-1-i];
	              ch[ch.length-1-i] = ch1;
	            }
	            String str = new String(ch);
	            ans += str+" ";
	        }
	        return ans.substring(0,ans.length()-1);
	    }
}
