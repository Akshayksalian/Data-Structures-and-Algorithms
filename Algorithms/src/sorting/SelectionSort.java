package sorting;

public class SelectionSort {
	public static void main(String [] args) {
		int a[]= {-5,-7,1,6,8,3,-10,-34};
		
		for(int i=0;i<a.length-1;i++) {
			
			int minindex=i;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[minindex]) {
					minindex=j;
				}
			}
				int temp=a[i];
				a[i]=a[minindex];
				a[minindex]=temp;
		}
		for(int x:a)
			System.out.print(x+" ");
	}

}
