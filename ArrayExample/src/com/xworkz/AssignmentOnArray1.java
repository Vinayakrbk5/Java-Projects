package com.xworkz;

public class AssignmentOnArray1 {

	public static void main(String[] args) {
		int[] num= {7,10,18,32,24,58,11};
		int length=num.length;
		int sum=0;
		double average;
		for(int i:num)
		{
		sum=sum+i;	
		}
		average=(sum/length);
		int p=1;
		System.out.println("The Length of the array is "+length);
		System.out.println("The values in the array are:");
		for (int j=0;j<length;j++) {
			System.out.println("The "+p+ " Elements in the array is "+num[j]);
			p++;
		}
		System.out.println("The sum of values in the array is "+sum);
		System.out.println("The average of all the values o the array is "+ average);
	}

}
