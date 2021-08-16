package arrays;

public class twodimensional {
	public static void main(String [] args) {
		int i,j;
		char[][]arr= {
						{'*'},
						{'*','*'},
						{'*','*','*'},
						{'*','*','*','*'},
						{'*','*','*','*','*'},
						{'*','*','*','*','*','*'},
						{'*','*','*','*','*','*','*'},
		};
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}
	}
}
