package array;

public class MinimumSwapAndKTogether {
	
	public static void main(String [] args) {
		
		int a[]={2, 1, 5, 6, 3};
		int n=a.length;
		int k = 3;
		
		int h =Complete.minSwap(a,n,k);
		System.out.println(h);
		
	}
}

class Complete{

    public static int minSwap (int a[], int n, int k) {
        
        boolean flag=true;
        int index=0;
        int count=0;
        
        for(int i=0;i<n;i++){
            if(a[i]>k && flag){
                flag=false;
                index=i;
            }
            
            if(a[i]<k){
                int temp=a[i];
                    a[i]=a[index];
                    a[index]=temp;
                    count++;
            }
            i=index;
        }
        return count;
    }
}
