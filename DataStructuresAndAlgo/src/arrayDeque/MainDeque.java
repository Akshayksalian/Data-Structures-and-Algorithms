package arrayDeque;

public class MainDeque {

	public static void main(String[] args) {
		
		Mydeque<Integer> md=new Mydeque<>();
		
		md.addHead(20);
		md.addHead(30);
		
		System.out.println(md.removeLast());

	}

}
