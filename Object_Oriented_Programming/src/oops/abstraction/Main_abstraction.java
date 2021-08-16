package oops.abstraction;

public class Main_abstraction  {
	
	public static void repair(Cars car) {
		System.out.println("Your car is Repaired ");
	}
	
	public static void main(String [] args) {
		
	Audi a = new Audi();
	Suzuki s= new Suzuki();
		
	repair(a);                                                     // here only by entering car name the car will  be repaired.(Complexity reduced)
	repair(s);							
	}
}
