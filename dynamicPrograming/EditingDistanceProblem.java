package com.dynamicPrograming;

/*Editing Distance Problem. (You may read problem 15-3 on page 364 for a better understanding of the problem. However, the problem definition is given below).
Let X[1..m] and Y [1..n] be two character strings. We want to edit the string X to the string Y . The operations we can use are (x is any character in the alphabet set):
• Insert(i,x): insert the character x after X[i] in X.
• Delete(i): delete the character X[i] in X.
• Replace(i,x): replace the character X[i] in X by the character x.
We have cost(Insert), cost(Delete), and cost(Replace) defined for these operations.
An edit sequence for X and Y is a sequence S of above operations that changes X into Y . Define cost(S) to be the sum of the costs of the operations in S. Note that there is at least one edit sequence: delete all characters in X one-by-one; then insert the characters in Y one-by-one.
In general, there are infinitely many editing sequences for X and Y . The editing distance between X and Y is defined to be:
dist(X, Y ) = min { cost(S) | S is an editing sequence for X and Y .}
(1) Describe a dynamic programming algorithm for computing dist(X, Y ). The run time of the algorithm should be O(nm).
(2) Let cost(Insert)=cost(Delete)= 2 and cost(Replace)=3. Let X =“algorithm” and Y = “altruistic”. Compute dist(X, Y ) by using the algorithm you designed in (1).
Application: Suppose that X represents an address. It may contains errors in it (such as misspelling, omission of letters, insertion of extra letters). We want to search a address database to find an address Y that “best matches” X. Then, dist(X, Y ) is the most logical definition of “closeness” of X and Y .
*/

public class EditingDistanceProblem {

	public static void main(String[] args) {
		    String str1 = "algorithm";
	        String str2 = "altruistic";
	        char x[] = str1.toCharArray();
	        char y[] = str2.toCharArray();
	        int ans = minumumDistance(x,y);
	        System.out.println(ans);
		}
		
		public static int minumumDistance(char x[],char y[]) {
			int insert = 2;
			int delete = 2;
			int replace = 3;
			int matrix[][] = new int[x.length+1][y.length+1];
			for(int i=0;i<=x.length;i++) {
				for(int j=0;j<=y.length;j++) {
					if(i==0 && j==0) {
						matrix[0][0] = 0;
					}else if(i==0) {
						matrix[0][j] = insert + matrix[0][j-1];
					}else if(j==0) {
						matrix[i][0] = delete + matrix[i-1][0];
					}else if(x[i-1] == y[j-1]) {
						matrix[i][j] = matrix[i-1][j-1];
					}else {
						matrix[i][j] = Math.min(matrix[i-1][j-1]+replace, Math.min(matrix[i-1][j]+insert, matrix[i][j-1]+delete));
					}
				}
			}
			
			for(int i=0;i<x.length+1;i++) {
				for(int j=0;j<y.length+1;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
			return matrix[x.length][y.length];
	}

}
