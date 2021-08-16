/*to print the fibonnaci for given number of times 
 * if n=3 
 * answer=0+1+1=2
 * 
 */
package Onedimnesionalarray;

public class Fibonacci {
	public static void main(String [] args) {
		int [] fib=new int[10];
		int i,t=1,s=0;
		
		for(i=0;i<fib.length;i++) {
			t=0+t;
			s=s+t;
			fib[i]=s;
			System.out.println(fib[i]);
		}
	}
}