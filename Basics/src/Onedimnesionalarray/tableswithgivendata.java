/*given variables
int tableof=7;
int [] arr={1,2,3,4,5,6,7,8,9,10};
no other variables can be declared*/
package Onedimnesionalarray;

public class tableswithgivendata {
	public static void main(String [] args) {
		int tableof=7;
		int [] arr={1,2,3,4,5,6,7,8,9,10};	
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(tableof+" x "+arr[i]);
			arr[i]=tableof*arr[i];
			System.out.print(" = "+arr[i]);
			System.out.println();
		}
	}
}
