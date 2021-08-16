package oops.exception_handling;

public class Throw_and_Throws {
	
	public static void main(String [] args) {
		
		fun1();
	}

	public static void fun1() {

		int a=5;
		int b=3;																		
		
		int c=a/b;
		System.out.println(c);
		
		try {                                  										// fun2 was called here so we are solving it error using try catch
		fun2();
		} catch(ArrayIndexOutOfBoundsException ai) {                   
			System.out.println(ai.getMessage()+"Sorry");
		}
	}
	
	public static void fun2() throws ArrayIndexOutOfBoundsException {				   	// We don't want to use try catch here so we use throws 	
		boolean dang = true;
		
		if(dang) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");              // We are creating error here 
		}	
	}
}