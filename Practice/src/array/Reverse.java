package array;

import java.util.Scanner;

public class Reverse {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many number into array");
        int n=s.nextInt();
        int []a=new int[n];
        
        
        System.out.println("Enter number into array");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
            
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        s.close();
    }
}

