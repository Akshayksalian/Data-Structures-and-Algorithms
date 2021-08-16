package oops.polymorphism;

public class Run_time_polymorphism {

	public static void main(String [] args) {
		
		Dog d = new Dog();
		
		Pet p = d; 			//Up_casting 
		
		
		d.walk();         // here function was called from the class dog  
		p.walk();		 // Here function was called from the class pet but we got it from the class dog this is 
		                 // because it thinks its from dog class because object was created from dog class and wont get to know until we run the program
		
	}
}

// only methods can be override variables can't be overridden