package array;

import java.util.Scanner;

public class Sumofarray {
   public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the array size");
        int n=s.nextInt();           
        int [] arr=new int[n];
        
        int sum=0;
        System.out.println("Enter the numbers in an array ");
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
        
        s.close();
   }
}
