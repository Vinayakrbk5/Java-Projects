package com.xworkz3;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] evenarray=new int[2][2];
		evenarray[0][0]=2;
		evenarray[0][1]=4;
		evenarray[1][0]=6;
		evenarray[1][1]=8;
	int length=evenarray.length;
		System.out.println("The first element is :"+evenarray[0][0]);
		System.out.println("the last element is :"+evenarray[length-1][length-1]);
		System.out.println("The two dimensional array elements are :");
		for(int i=0;i<evenarray.length;i++)
		{
			for(int j=0;j<evenarray.length;j++)
			{
				System.out.print("evenarray["+i+"]["+j+"] : ");
				System.out.println(evenarray[i][j]);
			}
		}

	}

}
