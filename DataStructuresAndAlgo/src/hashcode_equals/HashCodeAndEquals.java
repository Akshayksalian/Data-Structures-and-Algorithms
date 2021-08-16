package hashcode_equals;

import java.util.*;

public class HashCodeAndEquals {
	
	public static void main(String [] args) {
		
		pen pen1 = new pen(10,"Red");
		pen pen2 = new pen(10,"Red");
		
		Set<pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		
		System.out.println(pens);                                          // This print only one element because if hash code and equals helped 
	}
}

class pen {
	
	int price;
	String color;
	
	public pen(int price,String color) {
		this.price=price;
		this.color=color;	
	}

	@Override
	public int hashCode() {													// HashCode helps to make a unique object if the values are same (Because in maps the duplication is not allowed)
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {										// This will help to make true if both the object value are same .
		if (this == obj)
			return true;
		if (!(obj instanceof pen))
			return false;
		pen other = (pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}