import java.util.*;

public class SpringRoll {
	
	public static void main(String [] args) {
	
	Scanner s = new Scanner(System.in);
	
	int num = s.nextInt();
	num=num+num;
		
	s.close();
	
	int i=1;
	
	while(i<num) {
		System.out.println(i+" "+(i+1));
		System.out.println((i+3)+" "+(i+2));
		i=i+4;
	}
	
	}
}
