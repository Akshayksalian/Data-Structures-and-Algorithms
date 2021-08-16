package array;

import java.util.Scanner;

public class Lessthananumber {
	public static void main(String [] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the number to be searched for");
		int b=s.nextInt();
		
		System.out.println("Enter the array elements");
		int count=0;
		for(int i=0;i<=n;i++) {
			a[i]=s.nextInt();
			if(b>a[i]) {
				count++;
			}
		}
		s.close();
		System.out.println("Less than "+b+" was found "+count+" times in this array");
	}
}
