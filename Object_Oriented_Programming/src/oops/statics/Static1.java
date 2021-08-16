package oops.statics;

import oops.statics.First.Second;                 //importing of nested class
import oops.statics.First.Third;				  //imported the nested third class (we could have imported using star symbol also)

public class Static1 {
	
	static {
		System.out.println("i was printed first");   //first static will be printed before main 
	}
	
	static {
		System.out.println("I was printed Second");
	}
	
	public static void main(String [] args) {
		
		System.out.println("i was printed fourth");
		
		First obj1 =new First();
		Second obj2 = obj1.new Second();			// here Static was not used in the class so main class also should be called for calling nested class
		
		Third obj3 = new Third(); 					//here static was used so no need of creating a object of main class
	}
	
	static {
		System.out.println("i was printed third");
	}

}
