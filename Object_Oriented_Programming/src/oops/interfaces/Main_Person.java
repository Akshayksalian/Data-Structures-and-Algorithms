package oops.interfaces;

public class Main_Person implements Student,Youtuber { 	 		// Multiple interfaces is taken here 
	
	public static void main(String [] args) {
		
		Main_Person p = new Main_Person();						// Now object p has both the methods from youtuber and also student
																// Object of youtuber or student cannot be created 
		p.make_vedio();
		p.study();
		p.run();
		
	}

	@Override
	public void make_vedio() {
		System.out.println("Making Vedios");
	}

	@Override
	public void study() {
		System.out.println("Studing for gate");
	}

	@Override
	public void run() {
		System.out.println("person is running");
		
	}

}
