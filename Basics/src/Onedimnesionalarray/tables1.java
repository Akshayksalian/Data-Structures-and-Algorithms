/*to print tables of 19
 * but 1 to 10 should be initalized normaly
 * and using for loop it should be multiplied
 * so that we can get final output as 19 tables
 */
package Onedimnesionalarray;

public class tables1 {
	public static void main(String [] args) {
		int tab[]= {1,2,3,4,5,6,7,8,9,10};
		int i;
		
		for(i=0;i<tab.length;i++) {
			tab[i]=tab[i]*19;
			System.out.println(tab[i]);
		}
	}
}
