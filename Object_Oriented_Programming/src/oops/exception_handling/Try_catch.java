package oops.exception_handling;

public class Try_catch {
	
	public static void main (String [] args) {
		
		try {
			int a=5;
			int b=0;																		// To understand change the value
			
			int c=a/b;
			System.out.println(c);
			} catch(ArithmeticException e) {                                                 // ArithmeticException is the type of error
				System.out.println(e.getMessage()+" This is the error your facing ");
			} finally {																		// Finally will print all the time
				System.out.println(" I will be there always ");
			}
		
	}
	
}
