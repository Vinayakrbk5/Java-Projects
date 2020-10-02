package com.xworkz;

public class AssignmentOnArray2 {

	public static void main(String[] args) {
		int num[]= {7,10,18,32,24,58,11};
		int num1[]=new int[10];
		int n=1;
		int length=num.length;
		for (int i=0;i<length;i++)
		{
			num1[i]=num[i];
		}
		System.out.println("The Elements in the new array are:");
		for(int p:num1)
		{
			System.out.println("The "+n+" element in the array is "+p);
			n++;
		}
	}

}
