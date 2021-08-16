package sets;

import java.util.*;

public class Sets {
	
	public static void main(String [] args) {
		
		Set<Integer> s = new HashSet<>();						// If we use LinkedHashSet or TreeSet you will get all the elements present in the set in an order.
		Set<Integer> t = new HashSet<>();
		
		s.add(20);
		s.add(40);
		s.add(84);
		
		t.add(30);
		t.add(20);
		
		
		s.addAll(t);												// Adds all the elements from the t set to s set
		System.out.println(s);										
		
		System.out.println(s.size());								// Tells the size of the set
		
		System.out.println(s.containsAll(t)); 						// checks whether is set s elements contains the set t elements (Here its true because we have done operation addAll above).
		
		s.remove(20);												// Removes the mentioned element	
		System.out.println(s);										
		
		s.removeAll(t);												// Removes all from set s which are in the set t.
		System.out.println(s);
		
		t.add(40);
		s.retainAll(t);												// Prints the value of intersecting element (similar element present in the both the set).
		System.out.println(s);
		
		System.out.println(s.contains(40));                       	 // Checks whether a particular element is present or what
		
		s.clear();													// Empty is set will be present now.
		System.out.println(s); 									  	
	}

}
