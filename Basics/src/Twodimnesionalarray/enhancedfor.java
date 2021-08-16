package Twodimnesionalarray;

public class enhancedfor {
	public static void main(String[] args) {
		char marks[][]= {
				{'A','a'},
				{'B','b'},
				{'C','c'},
				{'D','d'}
		};
		
		for(char[] x :marks) {
			for(char y:x) {
				System.out.print(y+"\t");
			}System.out.println();
	
		}

	}
}