package com.leetcode.datastructure1.day3Array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		int buyIndex = 0, maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; ++i) {
			maxProfit = Math.max(maxProfit, prices[i] - prices[buyIndex]);
			if (prices[i] < prices[buyIndex])
				buyIndex = i;
		}
		return maxProfit;
	}
}
//Time Complexity T(n) = O(n)