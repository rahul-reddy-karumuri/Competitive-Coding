package dynamicPrograming1.day5;
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;++i){
            currentSum += nums[i];
            maxSum = Math.max(currentSum,maxSum);
            if(currentSum<0)
                currentSum = 0;
        }
        return maxSum;
    }
}
//Time Complexity T(n)=O(n)
