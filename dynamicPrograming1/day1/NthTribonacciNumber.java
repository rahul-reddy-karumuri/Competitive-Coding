package dynamicPrograming1.day1;
//https://leetcode.com/problems/n-th-tribonacci-number/
public class NthTribonacciNumber {
	 public int tribonacci(int n) {
	        if(n<=1)
	            return n;
	        if(n==2)
	            return 1;
	       
	        int t1=0,t2=1,t3=1,sum=0;
	        
	        for(int i=3;i<=n;++i){
	            sum=t1+t2+t3;
	            t1=t2;
	            t2=t3;
	            t3=sum;
	        }
	        return sum;
	    }
}
//Time Complexity T(n)=O(n)