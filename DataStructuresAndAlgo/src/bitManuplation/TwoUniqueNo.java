package bitManuplation;

public class TwoUniqueNo {
	
	public static void main(String [] args) {
		
		int a[]= {5,1,3,5,3,2,1,4};
		int n=a.length;
		
		int sum = a[0];
		
		for(int i=0;i<n;i++) {
			sum=sum^a[i];
		}
		
		sum=(sum & -sum);							// This will get us the right most set bit
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<n;i++) {
		
		if((a[i] & sum) >0) {
			sum1 =sum1 ^ a[i];
		} else {
			sum2=sum2^a[i];
		}
		
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
	}
}