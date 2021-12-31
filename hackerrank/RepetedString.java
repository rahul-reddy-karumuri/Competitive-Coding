package com.hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/repeated-string/problem

public class RepetedString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		long n = input.nextLong();
		long len = s.length();
		long q = n / len;
		long r = n % len;
		long frequency = q * getCountOfA(s,len) + getCountOfA(s,r);
		System.out.println(frequency);
		input.close();
	}
	
	static int getCountOfA(String s, long n) {
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}
}
