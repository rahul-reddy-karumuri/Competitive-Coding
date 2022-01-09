package datastructure2.day2Array;

//https://leetcode.com/problems/sort-colors/
public class SortColors {
	public void sortColors(int[] nums) {
		int zeroIndex = 0, twoIndex = nums.length - 1, index = 0;
		while (index <= twoIndex) {
			if (nums[index] == 0) {
				int temp = nums[zeroIndex];
				nums[zeroIndex++] = 0;
				nums[index++] = temp;
			} else if (nums[index] == 2) {
				int temp = nums[twoIndex];
				nums[twoIndex--] = 2;
				nums[index] = temp;
			} else
				++index;
		}
	}
}
//Time Complexity T(n) = O(n)