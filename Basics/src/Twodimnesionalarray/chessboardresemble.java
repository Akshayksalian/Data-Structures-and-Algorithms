//creating a 2 dimensional array representing a chess board 
//pattern should be in the form of 8*8
package Twodimnesionalarray;

public class chessboardresemble {
	public static void main(String [] args) {
		int [][] cboard=new int [8][8];
		int i,j,h=0;
	
		for(i=0;i<cboard.length;i++) { 
			for(j=0;j<cboard[i].length;j++) {
				h=h+1;
				cboard[i][j]=h;
				System.out.print(cboard[i][j]+" ");
			}System.out.println();
		}
	}
}
