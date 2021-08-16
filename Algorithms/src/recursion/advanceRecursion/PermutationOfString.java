package recursion.advanceRecursion;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {
	
	static Set<String> st = new HashSet<>();
	
	public static void main(String [] args) {
		
		p("abcc",0,3);
	}
	
	static void p(String s,int l,int r) {
		if(l==r) {
			if(st.contains(s)) return;
			st.add(s);
			System.out.println(s);
			return;
		}
		
		for(int i=l;i<=r;i++) {
			s=interChange(s,l,i);
			p(s,l+1,r);
			s=interChange(s,l,i);
		}
		
	}
	
	static String interChange(String s, int a, int b) {
		char arr[]=s.toCharArray();
		char temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(arr);
	}
}
