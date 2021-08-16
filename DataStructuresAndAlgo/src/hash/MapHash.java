package hash;

import java.util.*;
import java.util.Map.Entry;

public class MapHash {
	
	public static void main(String [] args) {
		
		Map<String,Integer> num = new HashMap<>();
		
		num.put("One",1);
		num.put("Two",2);
		num.put("Three",3);
		
		num.put("One",10);           								// This will not repeat the element in the hash map but changes the value of mentioned key.

		num.putIfAbsent("One",1);									// Key one will be 10 only instead of being 10 because we have used put if absent function.
		
		System.out.println(num);
		
		System.out.println(num.get("Two"));	 						// This gives the value of key we mention.
		
		System.out.println(num.containsKey("Four"));	   			// This will say whether a particular key is present or not.
		
		System.out.println(num.containsValue(3)); 				  	// This checks whether a particular value is present or not.
		
		num.replace("One",1);
		System.out.println(num);									// This will replace the value of a particular key.
		
		num.replace("Two",2,20);	
		System.out.println(num);									// This will replace the value only if the previous value is same as we mentioned.
		
		num.remove("Two");
		System.out.println(num);									// This will remove particular Entry.
		
		num.remove("Three",30);
		System.out.println(num);									// This will only remove the entry only if the value is same as mentioned here.
		
		System.out.println(num.keySet());							// You get only Keys in form of set.
		
		System.out.println(num.values()); 						 	// You get all the values in the form of set.
		
		System.out.println(num.entrySet());       					// This gives all the entries in form of set.
		
		
		
		// How to iterate to the entries
		
		Set<Entry<String,Integer>> e = num.entrySet();				// Entry should be imported separately.
		for(Entry<String,Integer> ent : e){							
			ent.setValue(ent.getValue()*100);
		}
		System.out.println(num);
	}
}
