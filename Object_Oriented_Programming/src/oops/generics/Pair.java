package oops.generics;

public class Pair <X,Y> {                                  // This x and y can be any data type ,it should be specified will creation of object 
	
	X a;
	Y b;
	
	public Pair (X c,Y d){								 // This is an Constructor
		a=c;
		b=d;
	}
	
	public void getDes() {
		System.out.println("I am "+a+" and my age is "+b);
}

}