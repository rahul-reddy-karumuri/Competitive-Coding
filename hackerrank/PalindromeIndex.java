package com.hackerrank;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str[] = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = input.next();
		}
		for(int i=0;i<n;i++) {
			int index = getRemovedIndex(str[i]);
			System.out.println(index);
		}
		input.close();
	}
	
	static int getRemovedIndex(String s) {
		int index = -1;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				boolean isRightPalindrome = isValidPalindrome(s.substring(i+1, s.length()-i));
				if(isRightPalindrome) {
					return i;
				}else {
					return s.length()-1-i;
				}
			}
		}
		return index;
	}
	
	static boolean isValidPalindrome(String s) {
		boolean isPalindrome = true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				isPalindrome = false;
			}
		}
		return isPalindrome;
	}

}
