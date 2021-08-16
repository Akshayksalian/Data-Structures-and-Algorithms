/*Creating a pattern
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777  using for loop
 */
package Forloop;

public class nestedforloop {
	public static void main(String [] args) {
		int i;
		int j;
		
		for(i=1;i<=7;i++) {
			for(j=1;j<i;j++)
			System.out.print(i);
			System.out.print(j);
			System.out.println();
		}
	}
}