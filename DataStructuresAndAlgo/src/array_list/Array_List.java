package array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Array_List {
	public static void main(String [] args) {
		
		List<String> veg = new ArrayList<>();				//This Array List 
		List<String> fruits = new LinkedList<>();			// This Linked List 
															// But both comes under list so List has been imported.
		veg.add("Carrot");
		veg.add("Tommato");
		veg.add("Onion");
		veg.add("Beans");
		
		fruits.add("Mango");								// add is to add the list.
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Watermelon");
		
		veg.addAll(fruits);                  				// addAll will helps to get all the elements in one list and merge with other list
											
		System.out.println(veg.get(5));					  	// get is to get the element in the present index 	
		
		veg.set(2,"Potato");
		System.out.println(veg);							// set is defined with index and new element name 
		
		
		veg.remove("Carrot");
		System.out.println(veg);							//remove remove mentioned element from the list 
		
		
		List<String> removing = new ArrayList<>();			// List to remove 
		removing.add("Onion");
		removing.add("Beans");
		
		veg.removeAll(removing);							// removeAll will remove the elements from the above list
		System.out.println(veg);
		
		System.out.println(veg.size());						// size let us know how many elements present in the list
		
		System.out.println(veg.contains("Onion"));			// contians check whether the element is present in the list or not
		
		System.out.println(veg.isEmpty());					// isEmpty let us know whether the list is empty or not
		
		String[] arr = new String[veg.size()];
		veg.toArray(arr);									// toArray has converted list to array
		
		for(String x : arr) {
			System.out.println(x);
		}
		veg.clear(); 										// Will clear the whole list
		System.out.println(veg);
	}

}
