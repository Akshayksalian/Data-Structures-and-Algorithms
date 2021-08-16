//for inputing the string nextLine
package userinput;

import java.util.Scanner;

public class Stringinput {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your name= ");
		String a=s.nextLine();
		
		s.close();
		System.out.println("Your first name is "+a);
	}
}
