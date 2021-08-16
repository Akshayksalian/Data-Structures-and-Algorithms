package oops.polymorphism;

public class Compile_time_polymorphism {

	public static void main(String [] args) {
		
		grd();
		grd("Akshay");                 // here it will get to know during compile time only because of different parameters in methods 
									   // (it is similar to method over loading)
	}
	
	public static void grd() {
		System.out.println("Hello Word");
	}
	
	public static void grd(String name) {
		System.out.println("My name is "+name);
	}
}
 