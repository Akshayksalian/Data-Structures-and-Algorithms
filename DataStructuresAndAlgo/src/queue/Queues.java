/* Throws exceptions
add()
remove()
element()

Returns null  (this will also do the same work but returns null) up it will show the exception(error)
offer()
poll()
peek()
*/

package queue;

import java.util.*;

public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer>q=new LinkedList<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q);
		
		q.remove();
		
		System.out.println(q);
		
		q.element();
		
		System.out.println(q);
		
	}

}
