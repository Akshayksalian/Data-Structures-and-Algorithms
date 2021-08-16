package oops.finals;

public final class Finals {              // this class can't be extended (This class can't have Subclass )

	public static void main(String [] args) {
	final String name="Akshay";         
										// can't be initialized with other name="Aksds";
	System.out.println(name);
	}
}


//if we use final in methods them it can't be overridden