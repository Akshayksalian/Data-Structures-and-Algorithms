//one to ten tables
package Forloop;

public class onetotentables {
	public static void main(String [] args) {
		int i;
		int a;
		int j;
		
		for(j=1;j<=10;j++) {
			for(i=1;i<=10;i++) {
			a=j*i;
			System.out.print(a);
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}
