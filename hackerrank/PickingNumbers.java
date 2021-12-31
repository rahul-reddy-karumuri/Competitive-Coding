package com.hackerrank;

import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		
		//https://www.hackerrank.com/challenges/picking-numbers/problem

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int inputArray[] = new int[n];
		for(int i=0;i<n;i++) {
			inputArray[i] = input.nextInt();
		}
		
		int indexArray[] = new int[100];
		for(int i=0;i<n;i++) {
			indexArray[inputArray[i]]++;
		}
		int result = 0;
		for(int i=1;i<100;i++) {
			result = Math.max(result, indexArray[i]+indexArray[i-1]);
		}
		System.out.println(result);
		
		input.close();
	}

}
