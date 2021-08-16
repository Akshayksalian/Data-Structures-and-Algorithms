package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueues {
	public static void main(String [] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(30);
		pq.add(50);
		pq.add(80);
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
	}

}
