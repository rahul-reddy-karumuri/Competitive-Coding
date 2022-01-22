package dynamicPrograming1.day2;
//https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
	       int a=0,b=0,minCost=0;
	       for(int i=2;i<=cost.length;++i){
	           minCost=Math.min(a+cost[i-2],b+cost[i-1]);
	           a=b;
	           b=minCost;
	       }
	        return minCost;
	    }
}
//Time Complexity T(n)=O(n)