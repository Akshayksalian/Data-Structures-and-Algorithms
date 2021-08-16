//random number genrator
package userinput;

import java.security.SecureRandom;
import java.util.Scanner;

public class random {
	public static void main(String [] args) {
		Scanner i=new Scanner(System.in);
		SecureRandom r=new SecureRandom();
		
		System.out.println("Guess a number between 1 to 10");
		int a=i.nextInt();
		
		int b=r.nextInt(10)+1;  //if plus one is not added here then it will print from 0 to 9. 
		i.close();
		
		if(a==b) {
			System.out.println("Nice!! You guessed the correct number");
		}else {
			System.out.println("Wrong!! The number was "+b+"\n Try again.");
		}
	}
}
