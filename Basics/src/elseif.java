
public class elseif {
	public static void main(String [] args) {
		int marks=33;
		
		if(marks>=85) {
			System.out.println("Congrats");
			System.out.println("Grade is A");
		}else if(marks>=50 && marks<=85) {
			System.out.println("Passed");
			System.out.println("B");
		}else {
			System.out.println("failed");
		}
	}
}

