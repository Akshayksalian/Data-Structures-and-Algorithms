//accepting there first name and last name
package commandlines;

public class namesinput {
	public static void main(String [] args) {
		if(args.length!=2) {
			System.out.println("please Enter first or last name");
			return;
		}
		System.out.println("HELLO");
		System.out.println("First name = "+args[0]);
		System.out.println("Last name = "+args[1]);
		System.out.println("Welcome to core java Development Course for Beginners");
	}
}
