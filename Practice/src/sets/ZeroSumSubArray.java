
// Given an array, find if there exists a sub array with sum equals to zero;

package sets;

import java.util.*;

public class ZeroSumSubArray {
	
	public static void main(String [] args) {
		
		int a[] = {2,1,-3,4,-2};
		boolean found = false;
		int sum=0;
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int x:a) {
			s.add(sum);
			sum+=x;
			if(s.contains(sum)) {
				found=true;
				break;
			}
		}
		System.out.println(found);	
	}

}
