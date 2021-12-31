package com.hackerrank;

import java.util.Scanner;

public class LongestCommonSubsequence {
	
	//https://www.hackerrank.com/challenges/common-child/problem
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		String s2 = input.next();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		int ans = LCSM1(ch1,ch2,s1.length(),s2.length());
		System.out.println(ans);
		
		input.close();
	}
	
    //Bottom-Up Approach/DP solution with 2d array
    static int LCSM1(char ch1[],char ch2[],int len1,int len2) {
    	
    	int answerArray[][] = new int[len1+1][len2+1];
    	
    	for(int i=0;i<=len1;i++) {
    		
			for(int j=0;j<=len2;j++) {
				
				if( i==0 || j==0) {
					answerArray[i][j] = 0;
				}
				else if(ch1[i-1] == ch2[j-1]) {
					answerArray[i][j] = answerArray[i-1][j-1] + 1;
				}
				else {
					answerArray[i][j] = Math.max(answerArray[i-1][j], answerArray[i][j-1]);
				}
			}
		}
    	return answerArray[len1][len2];
    }
    
    
    //Bottom-Up Approach/DP solution with 1d array
//    static int LCSM2() {
//    	
//    }
	
}
