package userinput;

import java.util.Scanner;

public class cricket {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		
	String [] indianCricketers = {
			"Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag", 
		    "Rahane", "Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit",
		    "Dinesh", "Harbhajan", "Ishant" };
	
	while(true) {
	System.out.print("Enter the name of the cricket player to search = ");
	String ser=s.next();

	for(int i=0;i<indianCricketers.length;i++) {
		if(ser.equalsIgnoreCase(indianCricketers[i])) {
			System.out.println(indianCricketers[i]+" is found");
			return;
		}
		}
		System.out.println("Not found\nSearch another name=? Press y to continue");
		char ch=s.next().charAt(0);
		if(ch=='y' || ch=='Y') {
			continue;
		}else {
			System.out.println("bye");
			break;
		}
	}s.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
/*
 *  }else
 * if(indianCricketers[i]!=ser){ System.out.
 * println("Its not found\nSearch one more name?\nIf yes press y else press n to exit"
 * ); char ch=s.next().charAt(0); if(ch=='y' || ch=='Y') { continue; }else {
 * System.out.println("Bye"); break; } }
 */
	
	

