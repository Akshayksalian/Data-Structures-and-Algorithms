import java.util.*;

public class Missingalpha {
	public static void main(String [] args) {
		
		String s ="akshay";
		
		ArrayList<Character> a = new ArrayList<>();
		ArrayList<Character> b = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch==' ') {
				continue;
			}
			a.add(ch);
		}
		
		for(char i='a';i<='z';i++) {
			b.add(i);
		}
		
		for(char x : b)
		if(!a.contains(x)) {
			set.add(x);
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(set);
		
	}

}
