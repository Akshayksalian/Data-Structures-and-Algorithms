package recursion;

public class NaturalNumbers {
	
	public static void main(String [] args) {
	
			System.out.println(natural(5)); 
	}
	
	public static int natural(int num) {
		
		if(num==1) return 1;
			return natural(num-1)+num;
	}
}
