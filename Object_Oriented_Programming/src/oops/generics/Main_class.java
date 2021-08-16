package oops.generics;

import java.util.ArrayList;

public class Main_class {
	
	public static void main(String [] args) {
		
		ArrayList<String> fruits = new ArrayList<>();               // <String> is generics here  
		Pair<String,Integer> p = new Pair<>("Akshay",21);			// here 2 generics was used in the class so 2 parameters should be defined 
																	// In pair class it has parameterized constructor so parameters should be declared here itself
		
		p.getDes();
		
		
		fruits.add("Apple");
		
		System.out.println(fruits);
		
	}

}
