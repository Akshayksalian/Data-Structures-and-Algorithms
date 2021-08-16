//chess board
package Forloop;

public class chessboard {
	public static void main(String [] args) {
	int i;
	int j;
	
	for(j=1;j<=4;j++) {
		for(i=1;i<=4;i++) {
			System.out.print("WB");
		}
		System.out.println();
		for(i=1;i<=4;i++) {
			System.out.print("BW");
		}System.out.println();
	}
	}
}
