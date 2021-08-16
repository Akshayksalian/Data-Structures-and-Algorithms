package linked_list;

public class My_linked_list <E> {
	
	Node<E> head;										// creating node head
	
	public void add(E data) {							// function of add
		Node<E> toadd =new Node<E>(data);					// object of node
		
		if(isEmpty()) {							// Checking whether the list is empty or not
			head=toadd;
			return;
		}
		Node<E> temp=head;								
		while(temp.next !=null) {					// if temp next is null then then it will stop ( this is to fetch the last position of the list)
			temp=temp.next;							// adding element to the last of the list
		}
		temp.next=toadd;							// toadd is the data
	}
	
	void print() {									//  this is function to print all the element in the list
		Node<E> temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public E removeLast() throws Exception{
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cant remove last element");
		}
		
		if(temp.next==null) {
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return toRemove.data;
	}
	
	
	public static class Node<E>{					// Created a class to store data and data's next.
		public E data;
		public Node<E> next;						// Reference of next node
		
		public Node(E d) {			                // Constructor of class node
			data=d;
			next=null;
		}
	}
}
