package datastructure2.day1Array;
//https://leetcode.com/problems/single-number/
public class SingleNumber {
	public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;++i)
            xor^=nums[i];
        
        return xor;
    }
}
//Time Complexity T(n) = O(n)