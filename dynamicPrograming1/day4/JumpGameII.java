package dynamicPrograming1.day4;

import java.util.Arrays;

//https://leetcode.com/problems/jump-game-ii/
public class JumpGameII {
	public int jump(int[] nums) {     
	      int len=nums.length;
	      int dp[] = new int[len]; 
	      Arrays.fill(dp,Integer.MAX_VALUE);
	      dp[0]=0;
	      for(int i=0;i<len;++i){
	          for(int j=i;j<=i+nums[i] && j<len ;++j){
	              dp[j]=Math.min(dp[j],dp[i]+1);
	          }
	      }
	      return dp[len-1];  
	    }
}
//Time Complexity T(n)=O(n^2)
