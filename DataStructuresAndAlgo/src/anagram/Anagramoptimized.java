package anagram;


public class Anagramoptimized {
	public static void main(String [] args) {
		
		String a="abb";
		String b="bbc";
		boolean isAnagram=false;
		
		int [] al=new int[256];
		
		if(a.length()==b.length()) {
		for(char x : a.toCharArray()) {
			int index=(int) x;
			al[index]++;
		}
		for(char y : b.toCharArray()) {
			int index=(int) y;
			al[index]--;
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
			isAnagram=false;
			break;
		}
		}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}
}
