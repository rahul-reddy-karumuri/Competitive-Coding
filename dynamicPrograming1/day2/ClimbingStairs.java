package dynamicPrograming1.day2;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
	public int climbStairs(int n) {
		if (n < 4)
			return n;

		int prevSum = 2, currSum = 3;
		for (int i = 4; i <= n; ++i) {
			int temp = currSum;
			currSum += prevSum;
			prevSum = temp;
		}
		return currSum;
	}
}

//Time Complexity T(n)=O(n)
