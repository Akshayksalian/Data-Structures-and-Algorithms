package userinput;

import java.util.Scanner;

public class Ifelse {

	static boolean time(float b) {
		  if(b==10.15 || b==13.30 || b==18.00 || b==22.00){
		    return true;
		      } else {
		    return false;
		      }
		  }
		    
			public static void main(String args[])
			{
				Scanner s=new Scanner(System.in);
		      int a = s.nextInt();
		      float b = s.nextFloat();
		      
		      if(a>13 && time(b)){
		        System.out.println("$5.00");
		        } else {
		        System.out.println("$8.00");
		        }
		      
		        if(a<13 && time(b)){
		        System.out.println("$2.00");
		        } else {
		        System.out.println("$4.00");
		        
		        s.close();
		        
		}
			}
	
}


  