package Whileloop;
//TO print even number from one to hundred
public class Challenge2While {
	public static void main(String [] args) {
		int n=100;
		
		while(n>0) {
			if(n%2==0) {
				System.out.println(n);
			}else {
				System.out.println("-");
			}
			--n;
		}	
	}
}
