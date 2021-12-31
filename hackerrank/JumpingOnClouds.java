package com.hackerrank;

import java.util.Scanner;

public class JumpingOnClouds {

	public static void main(String[] args) {
        
		//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		int ans = getMinimumJumps(arr);
		System.out.println(ans);
		
		input.close();
	}
	
	static int getMinimumJumps(int arr[]) {
		
		int count=-1;
		for(int i=0;i<arr.length;) {
			if(i+2<arr.length && arr[i+2] == 0) {
				i=i+2;
			}else {
				i++;
			}
			count++;
		}
		
		return count;
	}

}
