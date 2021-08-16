package userinput;

import java.util.Scanner;

public class Yesorno {
	public static void main(String[] args) {
		//Create Scanner object linked to keyboard.
		Scanner scanner = new Scanner(System.in);
		
		//Infinite loop, boolean check to exit this loop is inside loop's body
		while(true) {
			System.out.print("Enter either Y/N: ");
			String str = scanner.nextLine(); //Accept input as String.
			if(str.length() != 1) {
				System.out.println("Please provide only one character.");
				continue; //Continue with the next iteration of the loop.
			}
			
			//Extract character at 0th index from String object referred by str.
			char val = str.charAt(0);
			
			if(val == 'Y' || val == 'y') { //If user input is Y/y then, display Welcome! and exit the loop.
				System.out.println("Welcome!");
				break;
			} else if(val == 'N' || val == 'n') { //If user input is N/n then, display Good Bye! and exit the loop.
				System.out.println("Good Bye!"); 
				break;
			} else { //If user input is other than Y/y/N/n, then display message and continue with the next iteration of the loop.
				System.out.println("Please provide correct input.");
				continue; //Even if we don't provide continue, control will go to the next iteration, as it is the last statement in the loop.
			}
		}
		scanner.close(); //close the scanner
	}
}
