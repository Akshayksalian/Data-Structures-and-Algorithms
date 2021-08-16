package Whileloop;
//Addition of a given number
//eg= 4+3+2+1=10
public class ChallengeOnWhile {
	public static void main(String [] args) {
		int num = 7;
		int total=0;
		
		while(num>0) {
			total=total+num;
			num--;
		}
		System.out.println("Total of" +num+ "is "+total);
	}
}

