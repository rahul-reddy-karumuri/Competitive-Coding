package datastructure2.day1Array;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		HashSet<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; ++i) {
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					set.add(Arrays.asList(nums[i], nums[left], nums[right]));
					++left;
					--right;
				} else if (sum < 0)
					++left;
				else
					--right;
			}
		}
		List<List<Integer>> res = new ArrayList<>(set);
		return res;
	}
}

//Time Complexity T(n) = O(n^2)