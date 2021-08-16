
// FInd the only non repeating element , where every element repeats twice

package bitManuplation;

public class OneUniqueelement {
	
	public static void main(String [] args) {
		
		int a[]= {5,4,1,4,3,5,1};
		int n=a.length;
		int res=a[0];
		
		for(int i=1;i<n;i++) {
			res=res^a[i];						// 5 XOR( ^ ) 5 is 0
		}
		
		System.out.println(res);				// So only remaining element will be printed
	}

}
