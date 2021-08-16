package queue;

public class MainQueue {
	public static void main (String [] args) {
		
		
		MyQueue<Integer>q = new MyQueue<>();
		
		q.enqueue(200);
		q.enqueue(300);
		
		System.out.println(q.dequeue());
		
		}

}
