package Onedimnesionalarray;

public class arraywithfor {
	public static void main(String [] args) {
		int [] marks=new int[5];
		int i,total,per;
		
		marks[0]=99;
		marks[1]=95;
		marks[2]=88;
		marks[3]=81;
		marks[4]=85;
		
		total=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		per=total/5;
		
		System.out.println("Students scores are given below ");
		for(i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("Total marks of all 5 students is "+total);
		System.out.println("Average of all 5 students is "+per);
	}
}
