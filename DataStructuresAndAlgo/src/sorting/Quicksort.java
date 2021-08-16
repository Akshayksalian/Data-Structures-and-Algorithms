package sorting;

public class Quicksort {
	
	public static void main(String [] args) {
		
		int a[]= {15,9,7,13,12,16,4,18,11};
		int n=a.length;
		
		int low = 0;
		int high = n-1;
		
		Quicksort qs = new Quicksort();
		
		qs.quisorting(a,low,high);
		qs.print(a);
		
	}
	
	int partition(int a[],int low,int high) {
			
		int pivot = a[(low+high)/2];
		
		while(low <= high) {
			while(a[low] < pivot) {
				low++;
			}
			while(a[high] > pivot) {
				high--;
			}
			if(low <= high) {
				swap(a,low,high);
				
				low++;
				high--;
			}
		}	
		return low;
	}
	
	void swap(int a[],int low,int high) {
		int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
	}
	
	void quisorting(int a[],int low,int high) {

			int pivot = partition(a,low,high);
			
			if(low < pivot-1) {
				quisorting(a,low,pivot-1);
			}
			if(pivot < high) {
				quisorting(a,pivot,high);
			}
	}
	
	void print(int a[]) {
		for(int x : a)
			System.out.print(x+" ");
	}

}
