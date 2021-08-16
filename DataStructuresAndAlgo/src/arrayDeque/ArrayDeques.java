package arrayDeque;

import java.util.*;

public class ArrayDeques {
	public static void main(String []args) {
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		ad.add(20);
		ad.push(30);
		ad.remove();
		ad.addLast(40);
		ad.addFirst(50);
		ad.removeFirst();
		ad.pop();
		
		System.out.println(ad);
	}

}
