package oops.interfaces;

public interface Youtuber extends Athlet{				 // This can be extended by another interfaces 
	 													// Int x; By default this line has public static final
	void make_vedio();          						// This will be abstract and public by default
					
	default void like() {								// In interface you can only create method using default
		System.out.println(" ");
	}
}	
