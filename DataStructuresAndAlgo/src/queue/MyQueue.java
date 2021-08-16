package queue;

import linked_list.My_linked_list.Node;

public class MyQueue<E>{
	
	private Node<E> head,rear;                                       // Node is imported from the Linked List class 
	
	public void enqueue(E e) {
		
		Node<E> toadd=new Node<>(e);
		
		if(head==null) {                                         //   if list is empty then the head and rear will be the same 
			head=rear=toadd;
			return;
		}
		
		rear.next=toadd;										// if list is not empty then it will be added in the rear position and rear will go one step front
		rear=rear.next;
		
	}
	
	public E dequeue() {
		
		if(head==null) {										// if list is empty then it returns null
			return null;
		}
		Node<E> temp=head;										// storing the data in the temp so that we can display after deleting the element
		head=head.next;											// head we are pointing to the next element
		
		if(head==null) {										// if there is only one element then head and rear will be null
			rear=null;
		}
		return temp.data;										// deleted data will be returned.
	}

}
