package com.xworkz1;

public class copyarray {

	public static void main(String[] args) {
		double[] x=new double[5];
		x[0]=8.22;
		x[1]=31.41;
		x[2]=10.12;
		x[3]=19.87;
		x[4]=23.54;
		 int length= x.length;
		double[] y=new double[5];
		for(int i=0; i<length;i++)
		{
			y[i]=x[i];
		}
		System.out.println("The array values are");
		for(int j=0; j<length; j++)
		{
			System.out.println(y[j]);
		}
		System.out.println("The lenth of the array: "+length);
		System.out.println("The last element is: "+y[length-1]);
		System.out.println("The third element is :"+ y[2]);
		y[0]=9;
	    System.out.println("-------------------------");

		System.out.println("The new array values are");
		for(int j=0; j<length; j++)
		{
			System.out.println(y[j]);
		}
	}

}
