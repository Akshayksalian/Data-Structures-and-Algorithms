package userinput;

import java.util.Scanner;
import java.security.SecureRandom;

public class Twodice {
	public static void main(String [] args) {
		
	Scanner s=new Scanner(System.in);
	SecureRandom r=new SecureRandom();
	
	int r1=r.nextInt(6)+1;
	int r2=r.nextInt(6)+1;
	int r3=r1+r2;
	
	while(true) {
		System.out.print("Guess a number=");
		int a=s.nextInt();
		if(a==r3) {
			System.out.println("Hurray ! ,You won the match");
			break;
		}else if(a!=r3){
			System.out.println("You lost\nTry again");
			System.out.println("Like to play again ? \nIf yes press y else press n =");
			char ch=s.next().charAt(0);
			
			
			if(ch=='y' || ch=='Y') {
				continue;
			}else {
				System.out.println("BYE");
				break;
	}
		}
	}s.close();
	}
}