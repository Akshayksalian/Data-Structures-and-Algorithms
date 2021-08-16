package oops.encapsulation;

public class DataofStudent {
	public static void main(String [] args) {
		
	Students std = new Students();	
	
	std.setAge(20);
	std.setName("Akshay");
	
	System.out.println("My name is "+std.getName()+" and my age is "+std.getAge()+".");
	}
}
