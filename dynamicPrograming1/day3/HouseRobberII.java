package dynamicPrograming1.day3;
//https://leetcode.com/problems/house-robber-ii/
public class HouseRobberII {
	public int rob(int[] nums) {
        int len = nums.length;
        if(len==1)
            return nums[0];
        if(len==2)
            return Math.max(nums[0],nums[1]);
        if(len==3)
            return Math.max(nums[0],Math.max(nums[1],nums[2]));
        
       int first = getMax(nums,0,len-1);
       int second = getMax(nums,1,len);
       return Math.max(first,second);
    }
    
    private int getMax(int[] nums, int start, int end){
        int prev2=nums[start],prev1=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<end;++i){
            int temp = prev1;
            prev1 = Math.max(prev2+nums[i],prev1);
            prev2 = temp;
        }
         return prev1;
    }
}
//Time Complexity T(n)=O(n)
