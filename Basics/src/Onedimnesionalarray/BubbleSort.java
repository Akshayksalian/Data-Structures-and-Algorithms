package Onedimnesionalarray;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {1,5,-7,2,-4,8,-6};
		
		for(int i=0;i<arr.length-1;i++) {
			boolean sorted=true;					//this is added because if everything is in decending order only then in next for loop it wont enter4
																		//the if statement so boolean remains true and help to improve t and s
			
			for(int j=0;j<arr.length-1-i;j++) {      //-i is done here is to optmize the time and space 
													//because in bubble sort the last digit will be large after complition of second loop 
													//so we can ignore those 
													//when it completes second loop second time 2 last digits will be set 
				
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
					sorted=false;
				}
			}	
			if(sorted)								//checking whether boolean is true or not (it will be false only if it enters into if condition in Second for loop
				break;
		}
		for(int x:arr)
		System.out.print(x+" ");
	}
}
