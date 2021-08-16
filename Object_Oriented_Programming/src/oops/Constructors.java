package oops;

public class Constructors {
	
	int wheels,headlight;								// "this" is refering here	
	String color;
	
	Constructors(int w,int headlight,String c){	
		wheels=w;
		color=c;
		this.headlight=headlight;						// Here "this" is used to refer outer headlight because inner headlight has the same name 
	}
	
	public static void main(String [] args) {
		
		Constructors car= new Constructors(4,2,"red");
		
		System.out.println("My car has "+car.wheels+" wheels,"+car.headlight+" headlights and its color is "+car.color);
		
	}

}
