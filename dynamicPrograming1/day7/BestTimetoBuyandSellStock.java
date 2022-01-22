package dynamicPrograming1.day7;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		int buyIndex = 0, maxProfit = 0;
		for (int i = 1; i < prices.length; ++i) {
			maxProfit = Math.max(maxProfit, prices[i] - prices[buyIndex]);
			if (prices[i] < prices[buyIndex])
				buyIndex = i;
		}
		return maxProfit;
	}
}
//Time Complexity T(n)=O(n)