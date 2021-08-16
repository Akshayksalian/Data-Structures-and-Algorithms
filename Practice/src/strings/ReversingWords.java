/*
 * Reversing a words word by word
 * input:sky is blue
 * output: blue is sky
 * 
 */

package strings;

public class ReversingWords {
	public static void main(String [] args) {
		
	
	String words="planet       this in   coder        best the   am i  ";
	int n=words.length()-1;
	int i=n;
	String newWord="";
	
	while(i>=0) {
		
		while(i>=0 && words.charAt(i)==' ') {                //checking for spaces
			i--;
		}
		
		int j=i;											//once spaces finished index position is updated to j for further uses
		
		while(i>=0 && words.charAt(i)!=' ') {              // checking until next space to be found 
			i--;
		}
		
		newWord=newWord.concat(" "+(words.substring(i+1,j+1)));   //printing the position using j index position and i position
		
	}
		System.out.println(newWord);
	}
}
