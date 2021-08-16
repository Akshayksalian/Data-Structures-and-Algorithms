/* Creating a pattern
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777 using while loop
 */
package Whileloop;

public class pattern {
	public static void main(String [] args) {
		int i=1;
		int j=1;
		
		while(i<=7) {
			System.out.print(i);
			i++;
			
			while(j<i){	
				System.out.print(j);
				j++;
			}System.out.println();
		}
	}
}