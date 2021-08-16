//Inputing integer and string togther
package userinput;

import java.util.Scanner;

public class Intstrinputs {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your marks ");
		int a=s.nextInt();
		
		s.nextLine();
		System.out.print("Enter your name ");
		String b=s.nextLine();
		
		s.close();
		
		System.out.println("The student name is "+b+" and his marks is "+a);
		
	}
}
