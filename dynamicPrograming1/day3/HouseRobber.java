package dynamicPrograming1.day3;
//https://leetcode.com/problems/house-robber/
public class HouseRobber {
	public int rob(int[] nums) {
        int len = nums.length;
        if(len==0)
            return 0;
        if(len==1)
            return nums[0];
        if(len==2)
            return Math.max(nums[0],nums[1]);
        
        int prev2=nums[0],prev1=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<len;++i){
           int temp = prev1;
           prev1 = Math.max(prev2+nums[i],prev1);
           prev2 = temp;
        }
        
        return prev1;
    }
}
//Time Complexity T(n) = O(n)