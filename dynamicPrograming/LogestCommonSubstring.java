package com.dynamicPrograming;

public class LogestCommonSubstring {

	public static void main(String[] args) {
        String str1 = "JAVAAID";
        String str2 = "JAVAID";
        char x[] = str1.toCharArray();
        char y[] = str2.toCharArray();
        int ans = LCS(x,y);
        System.out.println(ans);
	}
	
	public static int LCS(char x[],char y[]) {
		int maxNumber=Integer.MIN_VALUE;
		int matrix[][] = new int[x.length+1][y.length+1];
		for(int i=0;i<=x.length;i++) {
			for(int j=0;j<=y.length;j++) {
				if(i==0 || j==0) {
					matrix[i][j] = 0;
				}else if(x[i-1] == y[j-1]) {
					matrix[i][j] = matrix[i-1][j-1]+1;
					maxNumber = Math.max(maxNumber, matrix[i][j]);
				}else {
					matrix[i][j] = 0;
				}
			}
		}
		return maxNumber;
	}

}
