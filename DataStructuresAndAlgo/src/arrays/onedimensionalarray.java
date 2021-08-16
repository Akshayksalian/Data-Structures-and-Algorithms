package arrays;

public class onedimensionalarray {
	public static void main(String [] args) {
		
		int[] score=new int[4];
		int a;
		double b;
		score[0]=81;
		score[1]=86;
		score[2]=94;
		score[3]=99;
		a=score[0]+score[1]+score[2]+score[3];
		b=a/4;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println("Total of 4 students is "+a);
		System.out.println("Average of 4 students is "+b);
	}
}
