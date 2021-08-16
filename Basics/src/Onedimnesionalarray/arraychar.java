/*finding a character in on ediminsional array
 * 
 */
package Onedimnesionalarray;

public class arraychar {
	public static void main(String [] args) {
		char array []= {'A','Z','B','N','P','T','X','C'};
		int i;
		char b;
		b='E';
		
		for(i=0;i<array.length;i++) {
			if(array[i]==b) {
				System.out.println(b+" is found");
				break;
			}
			else {
				System.out.println(b+" is not found");
				break;
			}
		}
		
	}
}
