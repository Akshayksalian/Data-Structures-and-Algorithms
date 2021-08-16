package Whileloop;
//print odd number sperated by a comma 
//end number will be speacified
public class Challenge3While {
	public static void main(String [] args) {
		int end=11;
		
		while(end>0) {
			if(end%2!=0)
				System.out.println(end);
			--end;
		}	
	}
}
 