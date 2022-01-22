package dynamicPrograming1.day7;
//https://leetcode.com/problems/best-sightseeing-pair/
public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int valueI=values[0],res=0;
        for(int j=1;j<values.length;++j){
            res=Math.max(res,valueI+values[j]-j);
            valueI=Math.max(valueI,values[j]+j);
        }
         return res;
     }
}
//Time Complexity T(n)=O(n)
