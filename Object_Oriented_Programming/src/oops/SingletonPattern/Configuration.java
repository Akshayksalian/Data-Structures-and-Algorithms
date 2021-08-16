package oops.SingletonPattern;

public class Configuration {
	
	private Configuration(){            // Constructor was created 
		
	}
	
	private static Configuration c =new Configuration();       // creating a object 
	
	public static Configuration getConfig() {				//returns configuration   // this is a method 
		return c;											
	}

}
