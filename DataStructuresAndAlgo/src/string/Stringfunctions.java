package string;

public class Stringfunctions {
	public static void main(String [] args) {
		String name="Akshay k Salian";
		String name1="       akshay k salian          ";
		
		System.out.println(name.charAt(5));    //this prints the charater which is at position 5
		System.out.println(name.length());		//prints length of the string
		System.out.println(name.substring(7));		//prints the string from index 7 to end
		System.out.println(name.substring(5, 13));		//prints the string from index 5 to 13 only
		System.out.println(name.contains("Akshay"));   //this checks whether the given word is present or not
		System.out.println(name.equals(name1));			//check equal or not
		System.out.println(name.equalsIgnoreCase(name1));  //this ignore case sensitive and check for equal or not
		System.out.println(name.isEmpty());					//check whether its empty or not
		System.out.println(name.concat(name1));				//concate two strings
		System.out.println(name.replace('a','z'));			//replace a with z
		System.out.println("--------------------------------");
		String n[]=name.split(" ");							//splits the given into new array which ever given inside brackets
		for(String x:n) {
			System.out.println(x);
		}
		System.out.println("--------------------------------");
		System.out.println(name.indexOf('S'));				//tells the index number of a character
		System.out.println(name.toUpperCase());				//turns everything into upper case
		System.out.println(name.toLowerCase());				//turns to lower case
		System.out.println(name1.trim());					//trims the space in the front and back of the string
		
		long n1=Long.parseLong(num1); 
		String s=String.valueOf(sum);
		
	}

}
