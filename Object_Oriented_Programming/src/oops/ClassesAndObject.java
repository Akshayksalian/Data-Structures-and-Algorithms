package oops;

class dogs{
	
	int legs,eyes;
	String name,breed;
	
	public void details() {
		System.out.println("My dog name is "+name+" is he is very much loyal and his breed is "+breed);
	}
	
	public void physical() {
		System.out.println("my dog has "+legs+" legs and "+eyes+" eyes");
	}
	
}

public class ClassesAndObject {
	public static void main(String [] args) {
		
		dogs dog1 =new dogs();
		dogs dog2=new dogs();
		
		dog1.name="blacky";
		dog1.breed="golden retrevier";
		dog1.legs=4;
		dog1.eyes=2;
		
		dog2.name="sweety";
		dog2.breed="pug";
		dog2.legs=4;
		dog2.eyes=2;
		
		dog1.details();
		dog1.physical();
		
		dog2.details();
		dog2.physical();
		
	}

}
