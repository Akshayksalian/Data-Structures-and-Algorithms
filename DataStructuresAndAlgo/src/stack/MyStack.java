package stack;

import linked_list.My_linked_list;

public class MyStack<E> {
	
	private My_linked_list<E> ll = new My_linked_list<>();
	
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Cant pop empty stack");
		}
		return ll.removeLast();
	}

}
