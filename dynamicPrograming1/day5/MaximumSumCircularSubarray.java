package dynamicPrograming1.day5;

//https://leetcode.com/problems/maximum-sum-circular-subarray/
public class MaximumSumCircularSubarray {
	public int maxSubarraySumCircular(int[] nums) {
		int total = nums[0], current_max = nums[0], max_so_far = nums[0], current_min = nums[0], min_so_far = nums[0],
				len = nums.length;
		for (int i = 1; i < len; ++i) {
			total += nums[i];
			current_max = Math.max(nums[i], current_max + nums[i]);
			max_so_far = Math.max(max_so_far, current_max);

			current_min = Math.min(nums[i], current_min + nums[i]);
			min_so_far = Math.min(min_so_far, current_min);
		}
		return max_so_far > 0 ? Math.max(max_so_far, total - min_so_far) : max_so_far;
	}
}
//Time Complexity T(n)=O(n)
