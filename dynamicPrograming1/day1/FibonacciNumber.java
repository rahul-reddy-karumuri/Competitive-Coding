package dynamicPrograming1.day1;

//https://leetcode.com/problems/fibonacci-number/
public class FibonacciNumber {
	public int fib(int n) {
		if (n <= 1)
			return n;

		int a = 0, b = 1, sum = 0;
		for (int i = 2; i <= n; ++i) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}
}
//Time Complexity T(n)=O(n)