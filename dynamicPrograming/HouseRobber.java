package com.dynamicPrograming;
//Maximum alternative Sum
public class HouseRobber {

	public static void main(String[] args) {
	   int array[] = {2,7,9,3,1};
       System.out.println(rob(array));
	}

	public static int rob(int array[]) {
		if(array.length==0)
			return 0;
		else if(array.length==1)
			return array[0];
		else if(array.length == 2)
			return Math.max(array[0], array[1]);
		
		int prev2 = array[0];
		int prev1 = Math.max(array[0], array[1]);
		
		for(int i=2;i<array.length;i++) {
			int temp = prev1;
			prev1 = Math.max(prev2+array[i], prev1);
			prev2 = temp;
		}
		
		return prev1;
	}
}
