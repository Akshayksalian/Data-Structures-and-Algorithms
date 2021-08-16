//To print only the first letter from the string
package userinput;

import java.util.Scanner;

public class Firstletter {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		String str1="akshay";
		String str2="Akshay";
		
		System.out.print("Enter the String ");
		String a=s.nextLine();
		s.close();
		
		char v =a.charAt(0);
		System.out.println("The first letter of the string you entered is "+v);
		
		//TODO:Converting the entered string to upper case
		System.out.println("String in upper case "+a.toUpperCase());
		
		//TODO:Checking whether str1 matches str 2
		System.out.println(str1.equals(str2));  //or it can also be written in (str1==str2)
		System.out.println(str1.equalsIgnoreCase(str2)); //it ignores cases
		
		//TODO : split the letter and print one by one in newline
		System.out.println("-------------------------\n the string one by one is here");
		for(int i=0;i<a.length();i++) {
			char h=a.charAt(i);  //This makes string to char i.e the words are split into letters
			System.out.println(h);
			
		}
		
	}
}
