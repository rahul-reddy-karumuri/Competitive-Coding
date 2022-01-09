package datastructure2.day1Array;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int majorNumber = nums[0], count = 0;
		for (int num : nums) {
			if (count == 0) {
				majorNumber = num;
				++count;
			} else if (num == majorNumber)
				++count;
			else
				--count;

		}
		return majorNumber;
	}
}
//Time Complexity T(n) = O(n)