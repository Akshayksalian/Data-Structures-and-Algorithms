//TO print the number which is divisible by 5 between one to hundered
package Forloop;

public class divisibleby5 {
	public static void main(String [] args) {
		int i;
		
		for(i=1;i<=100;i++) {
			if(i%5==0) {
			System.out.println("The number divisible by 5 are "+i);
			}
		}	
	}
}
