//to divisible by 5 without using modulus 
package Forloop;

public class divby5withoutmodulus {
	public static void main(String [] args) {
		int i;
		int a;
		
		for(i=1;i<=200;i++) {
			a=5*i;
			System.out.println(a);
			if (a==200) {
				break;
			}	
		}
	}
}
