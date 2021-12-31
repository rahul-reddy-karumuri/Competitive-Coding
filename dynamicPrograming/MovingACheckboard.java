package com.dynamicPrograming;

/* Suppose that you are given an n × n checkerboard and a checker. You must move the checker from the bottom edge to the top edge of the checkerboard according to the following rule. At each step, you may move the checker to one of the three squares:
1. The square immediately above it.
2. The square that is one up and one to the left (but only if the checker is not already in the leftmost column).
3. The square that is one up and one to the right (but only if the checker is not already in the rightmost column).
Each time you move from square x to square y, you receive p(x, y) dollars. You are given p(x, y) for all pairs (x, y) for which a move from x to y is legal. Do not assume that p(x, y) is positive. You must move the checker from somewhere along the bottom edge to somewhere along the top edge of the checkerboard. (You are free to pick the starting square and the ending square). The goal is to find a sequence of the moves that maximize the total dollar value you can collect. Describe a dynamic programming algorithm for solving this problem. The algorithm should
run in at most O(n2) time.*/

public class MovingACheckboard {

	static int n = 5;
	public static void main(String[] args) {
		int p[][] = {{7,0,8,-1,2},   
				     {1,3,2,7,0},
				     {0,-1,n,-2,2},
				     {3,n-1,-1,n,1},
				     {1,7,9,2,3}};
		System.out.println();
		System.out.println("Given p[x,y] be the given matrix");
		printMatrix(p);
		movingACheckboardAlgorithm(p);
	}
	
	static void movingACheckboardAlgorithm(int p[][]) {
		int profit [][] = new int[n][n];
		int path [][] = new int[n][n];
		
		for(int j=0;j<n;j++) {
			profit[n-1][j] = p[n-1][j];
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(j==0) {
					//profit[i][j] = Math.max(profit[i+1][j], profit[i+1][j+1])+p[i][j];
					if(profit[i+1][j] > profit[i+1][j+1]) {
						path[i][j] = j;
						profit[i][j] = profit[i+1][j];
					}else {
						path[i][j] = j+1;
						profit[i][j] = profit[i+1][j+1];
 					}
				}else if(j==n-1) {
					//profit[i][j] = Math.max(profit[i+1][j-1], profit[i+1][j])+p[i][j];
					if(profit[i+1][j-1] > profit[i+1][j]) {
						path[i][j] = j-1;
						profit[i][j] = profit[i+1][j-1];
					}else {
						path[i][j] = j;
						profit[i][j] = profit[i+1][j];
					}
				}else {
					//profit[i][j] = Math.max(profit[i+1][j-1], Math.max(profit[i+1][j], profit[i+1][j+1]))+p[i][j];
					if((profit[i+1][j-1] > profit[i+1][j]) && (profit[i+1][j-1] > profit[i+1][j+1])) {
						path[i][j] = j-1;
						profit[i][j] = profit[i+1][j-1];
					}else if((profit[i+1][j] > profit[i+1][j+1]) && (profit[i+1][j] > profit[i+1][j-1])) {
						path[i][j] = j;
						profit[i][j] = profit[i+1][j];
					}else {
						path[i][j] = j+1;
						profit[i][j] = profit[i+1][j+1];
					}
				}
				profit[i][j]+=p[i][j];
			}
		}	
		System.out.println();
		System.out.println("Profit matrix");
		printMatrix(profit);
		System.out.println();
		System.out.println("Path matrix");
		printMatrix(path);
		
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for(int i=0;i<n;i++) {
			if(max<profit[0][i]) {
				max = profit[0][i];
				maxIndex = i;
			}
		}
		System.out.println("The Maximum Sum is: "+max);
		printPath(path,maxIndex);
		
	}
	
	static void printMatrix(int matrix[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void printPath(int path[][], int index) {
		System.out.println(index);
		int k = 0;
		int i=n;
		int pathIndex = index;
		while(i>1) {
			pathIndex = path[k++][pathIndex];
			System.out.println(pathIndex);
			i--;
		}
	}

}
