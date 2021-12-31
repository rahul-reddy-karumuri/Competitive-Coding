package com.dynamicPrograming;

public class Knapsack01 {
	static int values[] = { 150, 300, 200 };
	static int weights[] = { 1, 4, 3 };

	public static void main(String[] args) {
		int ans = solveknapsack(3, 4);
		System.out.println(ans);
	}

	public static int solveknapsack(int num, int capacity) {
		int i, w;
		int matrix[][] = new int[num + 1][capacity + 1];

		for (i = 0; i <= num; i++) {
			for (w = 0; w <= capacity; w++) {
				if (i == 0 || w == 0) {
					matrix[i][w] = 0;
				} else if (weights[i - 1] > w) {
					matrix[i][w] = matrix[i - 1][w];
				} else {
					matrix[i][w] = Math.max(values[i - 1] + matrix[i - 1][w - weights[i - 1]], matrix[i - 1][w]);
				}
			}
		}
		printMatrix(matrix);
		return matrix[num][capacity];
	}

	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int w = 0; w < matrix[i].length; w++) {
				System.out.print(matrix[i][w] + " ");
			}
			System.out.println();
		}
	}
}
