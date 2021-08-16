package oops.inheritance;

public class Mainforexucting {
	
	public static void main(String [] args) {
		
		Teacher t = new Teacher();
		Singer s = new Singer();
		
		t.name="Akshay";
		s.name="Abhi";
		
		t.eat();
		t.teach();
		s.walk();
		s.sing();
	}

}
