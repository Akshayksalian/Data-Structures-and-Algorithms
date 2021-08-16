/*Enhanced for loop for one dimensional array
 * x can be acced only within that for loop and also it cant be intizalized outside the for loop
 */
package Onedimnesionalarray;

public class enhancedfor {
	public static void main(String [] args) {
		int num[]= {10,20,30,40,50};
		
		for(int x:num) {
			System.out.println(x);
		}
	}
}
