package interview;

import java.util.HashMap;

public class KSmallestSubstring {

	public static void main(String args[]) {
		System.out.println(smallestSubstring("0101101",3));
	}
	
	public static String smallestSubstring(String s, int k) {
		char ch[] = s.toCharArray();
		int count=0,windowSize=k;
		
		while(windowSize<s.length()) {
			for(int i=0;i<windowSize;++i)
				count+= ch[i]=='1'?1:0;
			
			if(count>=k)
				return s.substring(0, windowSize);
			
			int minLex = Integer.MAX_VALUE;
			HashMap<Integer,String> map = new HashMap<>();
			for(int i=windowSize;i<s.length()-1 ;++i) {
				count+=ch[i]=='1'?1:0 - ch[i-windowSize]=='1'?1:0;
				System.out.println(count);
				
				if(count>=k) {
					int lexCount = getLexCount(s.substring(i-windowSize,i+1));
					map.put(lexCount,s.substring(i-windowSize,i+1));
					minLex=Math.min(minLex, lexCount);
				}
			}
			
			if(map.size()>0)
				return map.get(minLex);
			
			++windowSize;
			count=0;
		}
		
		
		return "";
	}
	
	public static int getLexCount(String s) {
		int N = s.length();
		System.out.println(s);
        StringBuilder sb = new StringBuilder("");
 
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0')
                sb.append('0');
            else
                sb.append('1');
        }
 
        String bin = sb.toString();

        long X = (long)Math.pow(2, N);
 
        long Y = Long.parseLong(bin, 2);
 
        long ans = X + Y - 1;
        System.out.println(ans);
        return (int) ans;
	}
}
