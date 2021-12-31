package com.leetcodeDay1;

//https://leetcode.com/problems/first-bad-version/

public class FirstBadExample {

	public int firstBadVersion(int n) {
        int mid = n/2;
        if(isBadVersion(mid)){
         return getBadVersion(n, 0, mid);
        }else{
         return getBadVersion(n, mid+1, n);
        }
    }
    int position = 0;   
    public int getBadVersion(int n, int firstIndex, int lastIndex){
        if(firstIndex<=lastIndex){
            int mid = firstIndex + (lastIndex-firstIndex)/2;
            if(isBadVersion(mid)){
                position = mid;
                getBadVersion(n,firstIndex,mid-1);
            }
            else
                return getBadVersion(n,mid+1,lastIndex);
        }
        return position;
    }
    public boolean isBadVersion(int mid) {
    	//This function is defined in leetcode repo
    	return true;
    }

}
