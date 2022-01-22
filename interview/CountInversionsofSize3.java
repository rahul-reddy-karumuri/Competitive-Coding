package interview;

public class CountInversionsofSize3 {

	public static void main(String args[]) {
		int arr[] = {4,2,2,1};
		System.out.println(getInvCount(arr));
	}
	
	private static int getInvCount(int arr[]) {
		int res=0;
		for(int i=0;i<arr.length-1;++i) {
			int largeCount=0;
			for(int j=i-1;j>=0;--j) {
				if(arr[j]>arr[i])
					++largeCount;
			}
			int smallCount=0;
			for(int j=i+1;j<arr.length;++j) {
				if(arr[i]>arr[j])
					++smallCount;
			}
			res+=largeCount*smallCount;
		}
		return res;
	}
}
