package dynamicPrograming1.day6;
//https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/
public class MaximumLengthofSubarrayWithPositiveProduct {
	 public int getMaxLen(int[] nums) {
	        int positive=0,negative=0,max=0;
	        for(int num:nums){
	            if(num==0){
	                positive=0;
	                negative=0;
	            }
	            else if(num>0){
	                ++positive;
	                negative = negative==0?0:++negative;
	            }else{
	                int temp = positive;
	                positive = negative==0?0:++negative;
	                negative = ++temp;
	            }
	            max=Math.max(max,positive);
	        }
	        return max;
	    }
}
//Time Complexity T(n)=O(n)
