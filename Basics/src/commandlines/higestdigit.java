/**
 * Question 4:
 * Write a java program to accept more than 1 digits as command-line arguments and display the highest digit to the user. 
 * 
 * For example, if user passes 9, 14, 0, 23, 98, 2, 45 
 * Output should be: Highest digit is: 98
 */
package commandlines;

public class higestdigit {
	public static void main(String [] args) {
		
		if(args.length<=2) {
			System.out.println("Print more than two number.");
			return;
		}
		System.out.println("The numbers entered are:");
		
		int[] arr=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
			System.out.println(arr[i]);
		}
		
		int max=arr[0];
		for(int j=1;j<args.length;j++) {
			if(max<arr[j]) {
				max=arr[j];
			}
		}System.out.println("The higest number is "+max);
	}
}
