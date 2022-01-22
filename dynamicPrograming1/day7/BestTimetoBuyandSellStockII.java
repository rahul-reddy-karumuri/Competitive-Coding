package dynamicPrograming1.day7;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimetoBuyandSellStockII {
	 public int maxProfit(int[] prices) {
	        int profit=0,buy=0,sell=0,i=0,len=prices.length-1;
	        while(i<len){
	            while(i<len && prices[i]>=prices[i+1])
	                ++i;
	            buy=prices[i];
	            while(i<len && prices[i]<prices[i+1])
	                ++i;
	            sell=prices[i];
	            profit+=sell-buy;
	        }
	        return profit;
	    }
}
//Time Complexiy T(n)=O(n)