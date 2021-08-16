//inputing from the user and displaying it
package userinput;

import java.util.Scanner;

public class Inputs {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int a=s.nextInt();
		
		
		s.close();
		System.out.println("The integer nummber you entered is "+a);
	}
}
