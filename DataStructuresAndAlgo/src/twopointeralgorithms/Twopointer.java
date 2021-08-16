package twopointeralgorithms;

import java.util.Arrays;

class trip{   
	
	public boolean triplets(int arr[],int n) {
		
		Arrays.sort(arr);										// This will sort the array 
		
		for(int i=0;i<n-2;i++) {								// n-2 because j will be there at n-1
			if(twosum(arr,-arr[i],i+1)) {						// initializing parameters for two sum method
				return true;
			}
		}
		return false;
	}
	
	public boolean twosum(int a[],int x,int i) {			    // a will be sorted array ; x will be negative of first element ;  i will be second element 
		
		int j=a.length-1;										// J will be at last element
		
		while(i<j) {											// loops runs until i < j
			if(a[i]+a[j]>x) {
				j--;
			} else if (a[i]+a[j]<x) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}
}

public class Twopointer {		
	
	public static void main(String [] args) {
		
		
		int n = 10;												//Size of the array
		int []arr = {-4,-1,0,1,2,3,4,5,10,-48};					//unsorted array
		
		trip t = new trip();									//Creating a new object
		
		if(t.triplets(arr, n)) {								//Initializing to the parameters 
			System.out.println("1");							// 1 indicates found 
		} else {
			System.out.println("0");							// 0 indicates not found
		}
		
	}

}
