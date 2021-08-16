package recursion.advanceRecursion;

public class FloodFill {
	
	public static void main(String [] args) {
		
		int a[][]= {{1,2,2,2,1,1,2,1,2,1},
					{2,2,2,2,1,1,2,2,1,2},
					{2,2,2,1,2,1,2,1,2,2},
					{1,2,2,2,1,1,2,1,2,1},
					{2,2,2,2,1,1,2,2,1,2},
					{2,2,2,1,2,1,2,1,2,2}};
		
		fill(a,3,1,0,2);
		printMatrix(a);
	}

	static void fill(int a[][],int r, int c,int toFill,int prevFill) {
		
		int rows=a.length;
		int cols=a[0].length;
		
		if(r<0 || r>=rows || c<0 || c>=cols) return;
		
		if(a[r][c] != prevFill) return;
		
		a[r][c] = toFill;
		
		fill(a,r-1,c,toFill,prevFill);
		fill(a,r,c-1,toFill,prevFill);
		fill(a,r+1,c,toFill,prevFill);
		fill(a,r,c+1,toFill,prevFill);
		
		
	}
	
	static void printMatrix(int a[][]){
		for(int i = 0;i <= 5;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
