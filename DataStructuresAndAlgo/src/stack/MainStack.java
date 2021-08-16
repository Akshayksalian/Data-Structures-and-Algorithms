package stack;

public class MainStack {
	public static void main(String [] args) throws Exception {
		
		MyStack<Integer> s= new MyStack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.print(s.pop());			// poped element will be printed
		
		
	}
}
