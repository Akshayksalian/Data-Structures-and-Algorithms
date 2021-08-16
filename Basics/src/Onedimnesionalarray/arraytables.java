package Onedimnesionalarray;
/*to store from 1 to 1000 in one dimensional array
 * and print 1 to 10 in one row
 * eg 1 2 3 4 5 6 7 8 9 10 ..
 *    11 22 33 ..
 *                    ... 1000
 */
public class arraytables {
	public static void main(String [] args) {
		int tables[]=new int[1000];
		int i,j,h;
		
		for(i=0,j=1,h=1;i<tables.length;i++,j++) {
			tables[i]=j;
			if(j==h) {
				h=h+10;
				System.out.println();
			}
			System.out.print(j+" ");
		}
		
	}
}
